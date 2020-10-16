package servlogin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginPage extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.sendRedirect("LoginPage.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String Uname =  request.getParameter("uname");
			String pass = request.getParameter("pass");
			System.out.println(request);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			PreparedStatement ps = connect.prepareStatement("select Uname, Password1 from customer where Uname = ? and password1 = ? ;");
			ps.setString(1, Uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				Cookie cookie = new Cookie("Uname", rs.getString(1));
				response.addCookie(cookie);
				RequestDispatcher rd = request.getRequestDispatcher("home1");
			    rd.forward(request, response);
			  //response.sendRedirect("main1.html");
//				System.out.println(rs.getString(1));
//				response.setContentType("text/plain");
//				PrintWriter out  = response.getWriter();
//				out.print("Welcome "+rs.getString(1)+" :)");
//				out.flush();
//				out.close();
			}
			else {
				response.sendRedirect("LoginPage.html");
			}
			connect.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}

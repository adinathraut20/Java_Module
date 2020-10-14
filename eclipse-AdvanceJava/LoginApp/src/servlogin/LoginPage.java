package servlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginPage extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String Uname =  request.getParameter("uname");
			String pass = request.getParameter("pass");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			PreparedStatement ps = connect.prepareStatement("select Uname, Password1 from customer where Uname = ? and password1 = ? ;");
			ps.setString(1, Uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
				PrintWriter out = response.getWriter();
				out.print("<h1> Weclome "+rs.getString(1)+"!!! </h1>");
				out.flush();
				out.close();
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

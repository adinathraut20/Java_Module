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

@WebServlet("/register")
public class RegisterPage extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			PreparedStatement ps = connect.prepareStatement("insert into customer(Uname,password1,email,contact) values(?,?,?,?)");
			ps.setString(1, Uname);
			ps.setString(2, pass);
			ps.setString(3, email);
			ps.setString(4, contact);
			int r = ps.executeUpdate();
			if(r>0) {
				response.sendRedirect("LoginPage.html");
			}
			else {
				response.sendRedirect("RegistrationPage.html");
			}
			connect.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

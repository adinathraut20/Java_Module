package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			String q = "delete from student where roll = ?";
			PreparedStatement s = connect.prepareStatement(q);
			
			Scanner sc = new Scanner(System.in);
			int Roll = sc.nextInt();
			
			s.setInt(1,Roll);
			
			s.executeUpdate();
			connect.close();
			System.out.println("");
			sc.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

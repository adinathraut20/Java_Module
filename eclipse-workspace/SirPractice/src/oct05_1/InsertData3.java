package oct05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter course");
		String course = sc.next();
		System.out.println("Enter fee");
		float fee = sc.nextFloat();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			PreparedStatement s = con.prepareStatement(
					"insert into student values(?,?,?,?)");
			
			s.setInt(1, rno);
			s.setString(2, name);
			s.setString(3, course);
			s.setFloat(4, fee);
			
			int i = s.executeUpdate();		
			con.close();
			System.out.println(i+" record added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

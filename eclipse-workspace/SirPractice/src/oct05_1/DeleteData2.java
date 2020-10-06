package oct05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			PreparedStatement s = con.prepareStatement(
					"delete from student where rno = ?");

			s.setInt(1, rno);
			
			int i = s.executeUpdate();		
			con.close();
			System.out.println(i+" record deleted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

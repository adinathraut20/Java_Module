/* 11. Create a program to call a stored procedure, created to insert student record [ rno, name, marks].
 * 
 */

package q1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class q11Procedure {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Student Details\nRoll No.: ");
			int rno = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Marks: ");
			float marks = sc.nextFloat();
			System.out.print("Date of Birth yyyy-mm-dd : ");
			String d = sc.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
			CallableStatement s = con.prepareCall("{ call insert1(?,?,?,?)}");
			s.setInt(1, rno);
			s.setString(2, name);
			s.setFloat(3, marks);
			s.setString(4, d);
			boolean flag = s.execute();
			if(!flag) {
				System.out.println("Procedure Called.");
			}else {
				System.out.println("Failed to call Procedure.");
			}
			con.close();
			sc.close();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} 

	}

}

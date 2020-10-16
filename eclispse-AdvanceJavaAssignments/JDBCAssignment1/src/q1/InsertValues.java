/* 02. Create a program to insert record in the student table.
 * 
 */

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment","root","password");
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Student Details\n");	
				System.out.print("Name: ");
				String Name = sc.next();
				System.out.print("Marks: ");
				float marks = sc.nextFloat();
				System.out.print("Date of Birth yyyy-mm-dd : ");
				String d = sc.next();
				PreparedStatement st = con.prepareStatement("insert into student(name,marks,dob) values(?,?,?)");		
				//st.setInt(1, rno);
				st.setString(1,Name);
				st.setFloat(2,marks);
				st.setString(3, d);
				int flag = st.executeUpdate();
				con.close();
				sc.close();
				
				System.out.println("Values Inserted. "+flag);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	}

}

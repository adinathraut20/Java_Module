/* 04. Create a program to display the student records in sorted order of marks [ highest to lowest ].
 * 
 */
package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class q4SelectQuerySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment","root","password");

				PreparedStatement st = con.prepareStatement("select * from student order by marks desc");
				ResultSet rs = st.executeQuery();
				
				while(rs.next()) {
					System.out.println("Roll No : "+rs.getInt(1)+"\nName : "+rs.getString(2)+"\nMarks : "+rs.getFloat(3)+"\nDate of Birth : "+rs.getDate(4)+"\n");
				}
				con.close();
				
				System.out.println("Values Displayed. ");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	}

}

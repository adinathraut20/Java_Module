/* 05. Create a program to display no. of student records present in the table.
 * 
 */

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q5SelectQueryCount3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment","root","password");

				PreparedStatement st = con.prepareStatement("select count(rno) from student");
				ResultSet rs = st.executeQuery();
				
				while(rs.next()) {
					System.out.println("No. of Students : "+rs.getInt(1));
				}
				con.close();
				
				//System.out.println("Values Displayed. ");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
	}

}

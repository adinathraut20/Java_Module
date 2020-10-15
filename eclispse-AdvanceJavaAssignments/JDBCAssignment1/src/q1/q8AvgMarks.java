/* 08. Create a program to display average marks obtained by the student
 * 
 */

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q8AvgMarks {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
		PreparedStatement st = con.prepareStatement("select avg(marks) from student");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			System.out.println("Averge Marks : "+ rs.getFloat(1));
		}
		con.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}

	}

}

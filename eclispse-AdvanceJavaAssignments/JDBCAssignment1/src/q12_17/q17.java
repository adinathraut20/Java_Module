/* 17. Select all the employees who has experience more than 5 years.
 * 
 */

package q12_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q17 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
			PreparedStatement st = con.prepareStatement("select emp_name from employee where (year(curdate())-year(join_date)) > 5;");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("Employee : " + rs.getString(1));
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

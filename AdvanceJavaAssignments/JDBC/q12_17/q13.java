/* 13. Select the employee records with their address.
 * 
 */

package q12_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q13 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root",
					"password");
			PreparedStatement st = con.prepareStatement("select emp_name,city,country from employee,employeeAddress where employeeAddress.emp_id = employee.emp_id");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("Employee Name : " + rs.getString(1) + "\nCity : " + rs.getString(2) + "\nCountry : "+ rs.getString(3)+"\n");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

/* 15. Select all the employees who are in the given city.
 * 
 */

package q12_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class q15 {
	
	public static void main(String[] args) {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee City : ");
		String city = sc.next();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
		PreparedStatement st = con.prepareStatement("select emp_name from employee,employeeAddress where employee.emp_id = employeeAddress.emp_id and city = ?;");
		st.setString(1, city);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			System.out.println("Employee Name : " + rs.getString(1)+ "\n");
		}
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
  }
}

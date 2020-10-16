/* 14. Select the address of an employee whose employee id is given
 * 
 */

package q12_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root",
					"password");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			int empid = sc.nextInt();
			PreparedStatement st = con.prepareStatement("select city,country from employee,employeeAddress where employee.emp_id = employeeAddress.emp_id and employee.emp_id = ?;");
			st.setInt(1, empid);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("Address : " + rs.getString(1)+ ", " + rs.getString(2));
			}
			con.close();
			sc.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

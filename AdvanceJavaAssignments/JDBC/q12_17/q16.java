/* 16. Select the employee who gets highest salary.
 * 
 */

package q12_17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class q16 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
			PreparedStatement st = con.prepareStatement("select emp_name,salary from employee where salary IN (select max(salary) from employee);");
			ResultSet rs = st.executeQuery();

			if(rs.next()) {
				System.out.println("Employee with Highest Salary : "+ rs.getString(1)+"\nSalary : "+rs.getFloat(2));
			}else {
				System.out.println("Record Not found!!!");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

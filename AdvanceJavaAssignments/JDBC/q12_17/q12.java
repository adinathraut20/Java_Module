/* 12. There is need to store employee information [like : employee id, name, salary, join date] and employee's 
 * address information [like : address id, city, country, employee id]. Employee and Address information should be 
 * stored in separate tables. Create a program which can insert employee and address records. First store employee 
 * record and then address record. Make sure, if the address record is not saved then employee transaction should be 
 * rollbacked.
 */

package q12_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class q12 {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Savepoint save = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Employee Details\nEmployee Id : ");
			int eno = sc.nextInt();
			System.out.print("Employee Name : ");
			String name = sc.next();
			System.out.print("Salary : ");
			float salary = sc.nextFloat();
			System.out.print("Date of Joining yyyy-mm-dd : ");
			String d = sc.next();
			System.out.print("Enter Employee Address\nCity : ");
			String city = sc.next();
			System.out.print("Country : ");
			String country = sc.next();
			System.out.println("Address Id : ");
			int addId = sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root",
					"password");
			con.setAutoCommit(false);
			save = con.setSavepoint();
			Statement s = con.createStatement();
			
			String query1 = "insert into employee values("+eno+",'"+name+"',"+salary+",'"+d+"');";
			String query2 = "insert into employeeAddress values("+addId+",'"+city+"','"+country+"',"+eno+");";
			s.addBatch(query1);
			s.addBatch(query2);
			int[] arr = s.executeBatch();
			
			if(arr[1] == 0 || arr[0] == 0) {
				con.rollback(save);
			}
			con.commit();
			con.close();
			System.out.println("Records added.");
			sc.close();
		} catch (ClassNotFoundException | SQLException e) {
			con.rollback(save);
			e.printStackTrace();
		} 

	}

}

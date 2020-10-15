/* 01. Create a program to create table named student having columns [ rno, name, marks, date of birth].
 * 
 */

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment","root","password");
				Statement s = con.createStatement();
				boolean flag = s.execute("create table student ( rno int primary key auto_increment, name varchar(20), marks float, dob date);");
				if(!flag) {
					System.out.println("Table Created.");
				}else {
					System.out.println("Table Not Created");
				}
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

package oct05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			// loading jdbc driver [mysql type-4]
			// Class.forName("com.mysql.jdbc.Driver");  for mysql 5
			Class.forName("com.mysql.cj.jdbc.Driver");  // for mysql 8
			// creating jdbc connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			// creating statement [ query statement ]
			Statement s = con.createStatement();
			// executing query
			s.execute("create table if not exists student(rno int primary key,name varchar(35),course varchar(35),fee float)");
			// closing connection
			con.close();
			System.out.println("table created");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

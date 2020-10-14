package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
		Statement s = connect.createStatement();
		s.execute("create table student(Roll int primary key, Name varchar(20))");
		connect.close();
		System.out.println("Table Inserted");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			//Statement s = connect.createStatement();
			//int i = s.executeUpdate("insert into student values(102,'rahim')");
			PreparedStatement s = connect.prepareStatement("insert into student values(?,?)");
			
			Scanner sc = new Scanner(System.in);
			int Roll = sc.nextInt();
			String Name = sc.next();
			s.setInt(1,Roll);
			s.setString(2,Name);
			
			int i = s.executeUpdate();
			System.out.println(i);
			connect.close();
			System.out.println("");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

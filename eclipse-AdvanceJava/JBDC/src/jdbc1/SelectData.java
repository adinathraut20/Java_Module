package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			Statement s = connect.createStatement();
			String q = "select * from student";
			ResultSet rs = s.executeQuery(q);
			//System.out.println(rs.getInt(1)+rs.getString(2));
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2));
				
			}
			connect.close();
			System.out.println("");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}

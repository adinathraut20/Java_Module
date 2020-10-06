package oct05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectData {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","root");
			Statement s = con.createStatement();
			String q = "select * from student";
			System.out.println(q);
			ResultSet rs = s.executeQuery(q);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "
						+rs.getString(2)+" "
						+rs.getString(3)+" "
						+rs.getFloat(4)); 
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

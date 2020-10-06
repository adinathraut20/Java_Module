package oct05_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectData2 {

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
				System.out.println(rs.getInt("rno")+" "
						+rs.getString("name")+" "
						+rs.getString("course")+" "
						+rs.getFloat("fee")); 
			}
			con.close();			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

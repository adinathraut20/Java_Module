package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ScrollableResultSet {
	private static ResultSet rs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			
			PreparedStatement s = connect.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			rs = s.executeQuery();
			showForward();
			showForward();  // it will record only once
 			showBackward();
			
			connect.close();
			
			System.out.println("");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		private static void showForward() throws SQLException {
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			System.out.println("========================");
		}
		private static void showBackward() throws SQLException {
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			System.out.println("========================");
		}
		
	

}

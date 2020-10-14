package jdbc2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","password");
			
			CallableStatement s = connect.prepareCall("{ call call_pro(?,?) }");
			s.setInt(1,112);
			s.setString(2,"Pratik");
			int i = s.getUpdateCount();
			
			s.execute();
		
			connect.close();
			System.out.println(i+" record updated");
		
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class q10ColumnCount {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
		PreparedStatement st = con.prepareStatement("select * from student");
		ResultSet rs = st.executeQuery();
		ResultSetMetaData col = rs.getMetaData();
		if(rs.next()) {
			System.out.println("No. of columns : "+col.getColumnCount());
		}
		con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

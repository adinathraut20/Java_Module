package p01.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/AdvanceJavaAssignment";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "password";

	private Connection connect;

	public Connection getConnect() throws ClassNotFoundException, SQLException {
		if (connect == null || connect.isClosed()) {
			Class.forName(DRIVER_CLASS);
			connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		return connect;
	}
}
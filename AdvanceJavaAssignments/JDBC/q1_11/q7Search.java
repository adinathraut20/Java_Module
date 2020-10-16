/* 07. Create a program to search student record on the basis of given roll no.
 * 
 */

package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class q7Search {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Record Roll No. to Search : ");
		int rno = sc.nextInt();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJavaAssignment", "root","password");
		PreparedStatement st = con.prepareStatement("select * from student where rno = ?");
		st.setInt(1, rno);
		ResultSet rs = st.executeQuery();
			
		if(rs.next()) {
				System.out.println("Roll No : " + rs.getInt(1) + "\nName : " + rs.getString(2) + "\nMarks : "
						+ rs.getFloat(3) + "\nDate of Birth : " + rs.getDate(4) + "\n");
			}
		else {
			System.out.println("Record Not Found!!!");
		}
		con.close();
		}catch(SQLException|ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

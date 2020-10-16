package q6.StudentImplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import q6.StudentClass.Student;
import q6.StudentServices.StudentService;
import q6.connect.DBConnection;

public class StudentImple implements StudentService {

	private DBConnection Connect;
	
	public StudentImple() {
			Connect = new DBConnection();
		
	}
	
	@Override
	public int addStudent(Student student) {
		try {
		Connection Con = Connect.getCon();
		Statement st = Con.createStatement();
		String query = "insert into student(name,marks,dob) values('"+student.getName()+"',"+student.getMarks()+",'"+student.getDate()+"');";
		int flag = st.executeUpdate(query);
		System.out.println("Record Inserted : "+ flag);
		Con.close();
		}
		catch (SQLException e) {	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int modifyStudent(Student student) {
		try {
			Connection Con = Connect.getCon();
			Statement st = Con.createStatement();		
			String query = "update student set name ='"+student.getName()+"',marks = "+student.getMarks()+",dob = '"+student.getDate()+"' where rno = "+student.getRno()+";";
			int flag = st.executeUpdate(query);
			System.out.println("Record Updated : "+ flag);
			Con.close();
			}
			catch (SQLException | ClassNotFoundException e) {	
				e.printStackTrace();
			} 
			return 0;
		}
	

	@Override
	public int removeStudent(int rno) {
		try {
			Connection Con = Connect.getCon();
			Statement st = Con.createStatement();	
			String query = "delete from student where rno = "+rno;
			int flag = st.executeUpdate(query);
			System.out.println("Record Removed : "+ flag);
			Con.close();
			}
			catch (SQLException | ClassNotFoundException e) {	
				e.printStackTrace();
			} 
			return 0;
	}

	@Override
	public void studentList() {
		
		try {
			Connection Con = Connect.getCon();
			PreparedStatement s = Con.prepareStatement("select * from student");	
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				System.out.println("Roll No : "+rs.getInt(1)+"\nName : "+rs.getString(2)+"\nMarks : "+rs.getFloat(3)+"\nDate of Birth : "+rs.getDate(4)+"\n");
			}
			Con.close();
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		return ;
		
	}
	
}

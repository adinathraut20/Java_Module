package q9.StudentImplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		PreparedStatement st = Con.prepareStatement("insert into student(name,marks,dob) values(?,?,?)");
		//st.setInt(1,student.getRno());
		st.setString(1,student.getName());
		st.setFloat(2,student.getMarks());
		java.sql.Date dob = new java.sql.Date(student.getTime());
		st.setDate(3, dob);
		
		int flag = st.executeUpdate();
		System.out.println("Record Inserted."+ flag);
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
			PreparedStatement st = Con.prepareStatement("update student set name = ?, marks = ? , dob = ? where rno = ?");
			//st.setInt(1,student.getRno());
			st.setString(1,student.getName());
			st.setFloat(2,student.getMarks());
			java.sql.Date dob = new java.sql.Date(student.getTime());
			st.setDate(3, dob);
			st.setInt(4, student.getRno());
				
			int flag = st.executeUpdate();
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
			PreparedStatement st = Con.prepareStatement("delete from student where rno = ?");
			
			st.setInt(1, rno);
				
			int flag = st.executeUpdate();
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

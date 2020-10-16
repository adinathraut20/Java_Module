package q9.StudentServices;

import q9.StudentClass.Student;

public interface StudentService {
	public int addStudent(Student student);
	public int modifyStudent(Student student);
	public int removeStudent(int rno);
	public void studentList();
}

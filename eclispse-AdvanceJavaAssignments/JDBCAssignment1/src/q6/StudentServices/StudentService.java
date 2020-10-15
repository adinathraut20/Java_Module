package q6.StudentServices;

import q6.StudentClass.Student;

public interface StudentService {
	public int addStudent(Student student);
	public int modifyStudent(Student student);
	public int removeStudent(int rno);
	public void studentList();
}

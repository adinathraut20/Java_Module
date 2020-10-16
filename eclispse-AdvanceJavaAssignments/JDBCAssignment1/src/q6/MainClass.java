/* 06. Create a program to perform CRUD operations for student [ rno, name, marks, date of birth ] using Statement.
 *  Take values from keyboard.
 */

package q6;

import java.util.Scanner;
import q6.StudentClass.Student;
import q6.StudentServices.StudentService;
import q6.StudentImplement.StudentImple;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentImple();
		
		while(true){
			
			System.out.println("1 : Show Student list");
			System.out.println("2 : Add Student record");
			System.out.println("3 : Modify Student record");
			System.out.println("4 : Remove Student record");
			System.out.println("0 : Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 0: 
					System.exit(0);
			case 1:	
				studentService.studentList();
				break;
			case 2:
				System.out.print("Enter Record to Add\n");
				int rno ;
				// rno = sc.nextInt();
				System.out.print("Name : ");
				String name = sc.next();
				System.out.print("Marks : ");
				float marks  = sc.nextFloat();
				System.out.print("Date of Birth yyyy-mm-dd : ");
				String d = sc.next();
				Student student = new Student(0, name, marks,d);
				studentService.addStudent(student);
			
				break;
			case 3:
				System.out.print("Enter Roll No and Details to Modify Record\nRoll No : ");
				rno = sc.nextInt();
				System.out.print("Name : ");
				name = sc.next();
				System.out.print("Marks : ");
				marks  = sc.nextFloat();
				System.out.print("Date of Birth yyyy-mm-dd : ");
				d = sc.next();
				student = new Student(rno, name, marks, d);
				studentService.modifyStudent(student);		
				break;
				
			case 4:
				System.out.print("Enter Roll No. to Delete Record : ");
				rno = sc.nextInt();
				studentService.removeStudent(rno);
				break;
			}
		}
		

	}

}

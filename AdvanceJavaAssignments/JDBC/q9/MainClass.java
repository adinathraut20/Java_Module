/* 09. Create a program to perform CRUD operation for student [ rno,name,marks,date of birth ] using PreparedStatement. 
 * Take values from keyboard.
 */

package q9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import q9.StudentClass.Student;
import q9.StudentServices.StudentService;
import q9.StudentImplement.StudentImple;

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
				SimpleDateFormat StdFormat = new SimpleDateFormat("yyyy-mm-dd");
				Date dt1;
				try {
					dt1 = StdFormat.parse(d);
					
					Student student = new Student(0, name, marks, dt1);
					studentService.addStudent(student);
				} catch (ParseException e) {
					e.printStackTrace();
				}
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
				StdFormat = new SimpleDateFormat("yyyy-mm-dd");
				
				try {
					dt1 = StdFormat.parse(d);
		
					Student student = new Student(rno, name, marks, dt1);
					studentService.modifyStudent(student);
				} catch (ParseException e) {
					e.printStackTrace();
				}			
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

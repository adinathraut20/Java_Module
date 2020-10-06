/* 33. Write a program to demonstrate functionalities of this keyword in java. 
*/

import java.util.Scanner;

class Student {
	
	private int rno;
	private String name;
	private static int count;

	Student(){
		this(100,"null");
	}
	Student(int rno,String name){
		this.rno = rno;
		this.name = name;
		count++;
	}
	void setData(int rno,String name){
		this.rno = rno;
		this.name = name;
	}
	void showData(){
		System.out.print("\nRoll no : " + rno + "\nName : " + name + "\nStudent Count : " + count + "\n\n");
	}
}

class StudentDemo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no. : " );
		int rno = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		Student s1 = new Student();
		s1.showData();
		s1.setData(rno,name);
		s1.showData();

		System.out.println("Enter Roll no. : " );
		rno = sc.nextInt();
		System.out.println("Enter Name : ");
		name = sc.next();
		Student s2 = new Student(rno,name);
		s2.showData();
	}
}	

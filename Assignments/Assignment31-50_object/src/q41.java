/* 41. Write a program to demonstrate this() construct functionality.
*/



import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	
	Student(){
		this(0,"none");
	}
	
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	void display(){
	
		System.out.println("\nName : " + name + "\nRoll no : " + rollno + "\n");
	}
	
}

class StudentDemo{
	public static void main(String []args){

		Student s1 = new Student();
		s1.display();
		Student s2 = new Student(3,"Adinath");
		s2.display();
	}
}

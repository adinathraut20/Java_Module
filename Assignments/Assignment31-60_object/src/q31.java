/* 31. Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/

import java.util.Scanner;

class Student{
	private int rno;
	private String name;
	Student(){}
	void setData(int rno,String name){
		this.rno = rno;
		this.name = name;
	}
	void showData(){
		System.out.println("Roll no. : " + rno + "   Name : " + name);
		}
}

class StudentDemo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Roll no. : ");
		int rno = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		s1.setData(rno,name);
		s1.showData();
	}
}		

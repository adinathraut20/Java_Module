/* 32. Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]
*/

import java.util.Scanner;


class Student{
	private int rno;
	private String name;
	private static int count;
	Student(){
		count++;
	}
	void setData(int rno,String name){
			this.rno = rno;
			this.name = name;
	}
	void showData(){
		System.out.println("\nRoll no . : " + rno + "\nName : " + name + "\ncount of Students : " + count);
	}
}

class StudentDemo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no . : ");
		int rno = sc.nextInt();
		System.out.println("Enter Name : " );
		String name = sc.next();
		Student s1 = new Student();
		s1.setData(rno,name);
		s1.showData();

		Student s2 = new Student();
		System.out.println("\nEnter Roll no . : ");
		rno = sc.nextInt();
		System.out.println("Enter Name : " );
		name = sc.next();
		s2.setData(rno,name);
		s2.showData();
	}
}

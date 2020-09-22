/* 40. Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
*/


import java.util.Scanner;

class Student{
	private String name;
	private int rollno;
	private int age;
	private int score;

	Student(){
		
		name = "";
		rollno = age = score = 0;
	}
	
	Student(String name,int rollno,int age, int score){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	void setData(String name,int rollno,int age,int score){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	 int getScore(){
		return score;
	}	

	void display(){
		
		System.out.println("Name : "+name+"\nRoll No. : "+rollno+"\nAge : "+age+"\nMarks Scored : "+score+"\n ");
	}
}

class StudentDemo{

	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students : ");
		int no = sc.nextInt();
		Student arr[] = new Student[no];
		for(int i=0;i<no;i++){
			arr[i] = new Student();
			System.out.print("\nEnter Name : ");
			String name = sc.next();
			System.out.print("Enter Roll No. : ");
			int rollno = sc.nextInt();
			System.out.print("Enter Age : ");
			int age = sc.nextInt();
			System.out.print("Enter Marks Scored :");
			int score = sc.nextInt();
			arr[i].setData(name,rollno,age,score);
		}


		
		System.out.println("\nStudents with Marks 0-50 :");	
		for(Student i : arr){
			if(i.getScore() <= 50){
				i.display();
			}
		}
		
		System.out.println("\nStudents with Marks 51-65 :");
		for(Student i : arr){
			if(i.getScore() > 50 && i.getScore() <= 65 ){
				i.display();
			}
		}

		System.out.println("\nStudents with Marks 66-80 :");	
		for(Student i : arr){
			if(i.getScore() > 65 && i.getScore() <= 80){
				i.display();
			}
		}
		
		System.out.println("\nStudents with Marks 81-100 :");	
		for(Student i : arr){
			if(i.getScore() > 80 ){
				i.display();
			}
		}

/*		for(int i=0;i<n;i++){
			boolean flag = false;
			for(int j=0;j<n-1;j++){
			
				if(arr[j].score < arr[j+1].score){

					Student temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}

			}
			if(flag == false){
				break;
			}
		}
*/

	}
}

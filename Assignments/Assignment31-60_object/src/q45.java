/* 45. Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays className. Create a class( say Demo) with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. 
*/



import java.util.Scanner;

class Student{
	private int rollno;
	private double percentage;
	
	Student(){
		rollno = 0;
		 percentage = 0;
	}
	
	Student(int rollno,double percentage){
		this.rollno = rollno;
		this.percentage = percentage;
	}

	int getRollNo(){
		return rollno;
	}
	double getPercentage(){
		return percentage;
	}

	void show(){
		
		System.out.println("\nRoll No. : " + rollno + "\nPercentage : " + percentage+"%");
		}
}

class CollegeStudent extends Student{
	private int semester;
	
	CollegeStudent(){
		semester = 1;
	}

	CollegeStudent(int rollno,double percent,int semester){
		super(rollno,percent);
		this.semester = semester;
	}

	void show(){
		super.show();
		System.out.println("Semester : " + semester);
	}
	
}

class SchoolStudent extends Student{
		private String className;

		SchoolStudent(){
			className = "10th";
		}
		
		SchoolStudent(int rollno,double percent,String className){
			super(rollno,percent);
			this.className = className;
		}

		void show(){
			super.show();
			System.out.println("Class Name : " + className);
		}
}

class Demo{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details : ");	
		
		//1)Array of any class

		System.out.print("No of College Student : " );
		int no = sc.nextInt();
		CollegeStudent arr[] = new CollegeStudent[no];
		for(int i=0;i<no;i++){
		
			System.out.print("\nStudent "+(i+1)+"th : \nRoll No. : ");
			int rollno = sc.nextInt();
			System.out.print("Percentagae : " );
			double percent = sc.nextDouble();
			System.out.print("Semester : ");
			int semester = sc.nextInt();

			arr[i] = new CollegeStudent(rollno,percent,semester);
		}
		
		System.out.println("\nDisplay Array of College Student : ");
		for(CollegeStudent i : arr){
			i.show();
		}	
		
		//2)create 2 collegeStudent 3 SchoolStudent
		
		System.out.print("\nNo. of All Student : " );
		no = sc.nextInt();
		Student arr1[] = new Student[no];
		for(int i=0;i<no;i++){
			
			System.out.print("\nStudent "+(i+1)+"th : ");
			System.out.print("\nRoll No. : ");
			int rollno = sc.nextInt();
			System.out.print("Percentage : " );
			double percent = sc.nextDouble();

			System.out.print("\nEntered Student Type  : \nFor College press  : 1\nFor School press   : 2\nOnly Student press : 3\n" );
			int str = sc.nextInt();
			if(str == 1){
			
				System.out.print("Semester No. : ");
				int semester = sc.nextInt();
				arr1[i] = new CollegeStudent(rollno,percent,semester);
				
			}
			else if(str == 2){
				System.out.print("Class Name '10th', '12th' : ");
				String className = sc.next();
				arr1[i] = new SchoolStudent(rollno,percent,className);

			}
			else {
				arr1[i] = new Student(rollno,percent);
			}
		}
		int flag = 0;
		System.out.println("\nDisplaying Array of College Student and School Student : ");
		for(Student i : arr1){
			i.show();
		}
		
		System.out.print("\nEnter the Roll No. to check : ");
		int rollno = sc.nextInt();
		int count = 0;
		for(Student i : arr1){
			if(i.getRollNo() == rollno){
				if(i instanceof CollegeStudent){
						System.out.println("\nRoll No. : " + rollno + " is CollegeStudent");
						flag = 1;
				}
				else if(i instanceof SchoolStudent){
						System.out.println("\nRoll No. : " + rollno + " is School Student");
						flag = 1;
				}
				else{
						System.out.println("\nRoll No. : " + rollno + " is (only) Student");
						flag = 1;
				}
			}
			if(i.getPercentage() > 75){
				count++;
			}
		}
		if(flag == 0){
			System.out.println("\nRoll No. : "+ rollno + " not Found !!!");
		}
		System.out.println("\n\nTotal No. Students having 'A' grade are : "+ count);
	}
}	
		

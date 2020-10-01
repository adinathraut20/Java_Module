/* 37. Create a class Person with properties (name and age) with following features. 
a. Default age of person should be 18.
b. A person object can be initialized with name and age.
c. Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/


import java.util.Scanner;

class Person{
	int age;
	String name;
	Person(){
		this.age = 18;
		this.name = "";
	}

	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	void display (){
		System.out.println("\nName : " + this.name + "\nAge : " + this.age + "\n");
	}
}

class PersonDemo{
	public static void main(String []args){
		Person p1 = new Person();
		Person p2 = new Person(20,"Adi");

		p1.display();
		p2.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : " );
		String name = sc.next();
		System.out.println("Enter Age :");	
		int age = sc.nextInt();
		Person p3 = new Person(age,name);
		p3.display();
		
		
	}
}

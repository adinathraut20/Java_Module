/* 49. Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.
*/

import java.util.Scanner;

interface Taxable{
		 double salesTax=0.07;
		 double incomeTax=0.105;
		
	   	 double calcTax();
	}

class Employee implements Taxable{
	private int empId;
	private String name;
	private double salary;
	
	Employee(int empId, String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public double calcTax(){
		return (double) salary*incomeTax;
	}
}

class Product implements Taxable{
	private int pid;
	private double price;
	private int quantity;
	
	Product(int pid, double price,int quantity){
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	public double calcTax(){
		return (double) salesTax*price*quantity;
	}

}


class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details:");
		System.out.print("Employee Id : ");
		int empId = sc.nextInt();
		System.out.print("Employee Name : ");
		String name = sc.next();
		System.out.print("Employee Salary : ");
		double salary = sc.nextDouble();
		
		Taxable e1 = new Employee(empId,name,salary);
		
		System.out.println("Enter Product Details:");
		System.out.print("Product pid : ");
		int pid = sc.nextInt();
		System.out.print("Product Price : ");
		double price = sc.nextDouble();
		System.out.print("Product Quantity : ");
		int quantity = sc.nextInt();
		
		Taxable p1 = new Product(pid,price,quantity);

		System.out.println("Income Tax : "+e1.calcTax());
		System.out.println("Sales Tax : "+p1.calcTax());
	}
}
			

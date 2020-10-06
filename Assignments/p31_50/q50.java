/* 50. Explain the importance of toString() and equals() method of the Object class and override them on 
 * class Employee(empId,name,salary).  a. Create class for main method(say XYZ),and accept five employees 
 * information and store in an array. Also ensure if entered empId already exist or not (use equals method).  
 * b. Display all employee info using toString method.
 */

package p51_60;

import java.util.Scanner;

class Employee {
	private int empId;
	private String  name;
	private double salary;
	Employee(int empId,String name,double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Employee E1) {
		if(E1.getEmpId() == this.empId ) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		String str = "{ EmpId : "+this.getEmpId()+"\n Name : "+this.getName()+"\n Salary : "+this.getSalary()+"  },\n";
		return str;
	}
}



public class q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee No : ");
		int no = sc.nextInt();
		
		Employee []arr = new Employee[no];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+(i+1)+"th Employee Details : ");
			System.out.print("EmpId : ");
			int emp = sc.nextInt();
			System.out.print("Name : ");
			String str = sc.next();
			System.out.print("Salary : ");
			double sal = sc.nextDouble();
			arr[i] = new Employee(emp,str,sal);
			for (int j = 0; j < i ; j++) {
				if(arr[i].equals(arr[j])) {
					i--;
					System.out.println("Double Employee ID Entry!!! \nEnter Details again :\n");
					break;
				}
			}
		}
		System.out.println("\n[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
			
		}
		System.out.println("  ]");
		sc.close();
		
		

	}

}

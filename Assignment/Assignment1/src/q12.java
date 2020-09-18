/* 12. In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/


import java.util.Scanner;

class EmployeeSalary{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee's salary : ");	
		double Salary = sc.nextDouble();
		double HRA;
		double DA;
		HRA=0;
		DA=0;
		if(Salary < 1000){
			HRA = 0.1*Salary;
			DA = 0.9*Salary;
		}
		else if(Salary >= 1000){
			HRA = 2000;
			DA = 0.98*Salary;
		}
		double GrossSal = Salary + DA + HRA;
		System.out.println("Employee's Gross Salary is : "+GrossSal);
		}
}

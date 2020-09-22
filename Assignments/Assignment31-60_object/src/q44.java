/* 44. Create three classes
Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/


import java.util.Scanner;

class Faculty{
		private int facultyId;
		private double salary;
		
		Faculty(){
			facultyId = 0;
			salary = 3000;
		}
		
		Faculty(int facultyId){

			this.facultyId = facultyId;
		}

		void input(int facultyId){
		
			this.facultyId = facultyId;
		}
		void setSalary(double salary){
			
			this.salary = salary;
		}

		void printSalary(){
			
			System.out.println("\nFaculty Id : " + facultyId + "\nSalary : " + salary+"\n");
		}
}
		
class FullTimeFaculty extends Faculty{
		
		private double basicSalary;
		private double allowance;
		
		FullTimeFaculty(){
			basicSalary = 5000;
			allowance = 0.5;
		}
		
		FullTimeFaculty(int facultyId){

			super(facultyId);
		}
		
		void input(double basicSalary,double allowance){

			this.basicSalary = basicSalary;
			this.allowance = allowance;
			super.setSalary(basicSalary + allowance);
		}

}

class PartTimeFaculty extends Faculty{
		
		private double workingHours;
		private double ratePerHour;
		
		PartTimeFaculty(){
			workingHours = 0;
			ratePerHour = 100;
		}

		PartTimeFaculty(int facultyId){

			super(facultyId);
		}
		
		void input(double workingHours,double ratePerHour){
			
			this.workingHours = workingHours;
			this.ratePerHour = ratePerHour;
			super.setSalary(workingHours * ratePerHour);

		}
}

class Demo{
	public static void main(String []args){
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Details for Full time Faculty : \nFacultyId : ");
			int fac = sc.nextInt();
			System.out.print("Basic Salary : ");
			double basic = sc.nextDouble();
			System.out.print("Allowance : ");
			double allowance = sc.nextDouble();
			
			FullTimeFaculty f1 = new FullTimeFaculty(fac);
			f1.input(basic,allowance);
			
			System.out.print("Enter Details for Part time Faculty : \nFacultyId : ");
			fac = sc.nextInt();
			System.out.print("Working Hour : ");
			basic = sc.nextDouble();
			System.out.print("Rate per Hour : ");
			allowance = sc.nextDouble();
			PartTimeFaculty p1 = new PartTimeFaculty(fac);
			p1.input(basic,allowance);
			f1.printSalary();
			p1.printSalary();	
	}
}	

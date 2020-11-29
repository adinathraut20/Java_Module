package p1;

class Employee{
	private int empId;
	private String empName;
	
	{
		System.out.println("instance initializer block 1");
	}
	{
		System.out.println("instance initializer block 2");
	}
	public Employee() {
		
		System.out.println("no arg");
	}
	public Employee(int empId, String empName) {
		System.out.println("param");
		this.empId = empId;
		this.empName = empName;
	}
	
}

public class InitBlockDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(101,"ram");

	}

}

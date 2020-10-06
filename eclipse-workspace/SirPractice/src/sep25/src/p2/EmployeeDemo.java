package sep25.src.p2;

class Employee{
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return empId+" "+empName;
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Ram");
		System.out.println(e);
	}

}

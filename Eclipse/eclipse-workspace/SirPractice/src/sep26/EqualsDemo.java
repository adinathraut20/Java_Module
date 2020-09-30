package sep26;
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
		return empId + " " + empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return empId == emp.empId;
		}
		return false;
	}
	
}


public class EqualsDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "ram");
		Employee e2 = e1;
		Employee e3 = new Employee(101, "ram");
		Employee e4 = new Employee(102, "shiv");
		System.out.println("e1.equals(e2) "+e1.equals(e2));
		System.out.println("e1.equals(e3) "+e1.equals(e3));
		System.out.println("e1.equals(e4) "+e1.equals("abc"));
	}

}

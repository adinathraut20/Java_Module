package sep29;

import java.util.ArrayList;
import java.util.Collection;
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
	
}
public class CollectionDemo15 {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(31, "ram"));
		a.add(new Employee(13, "shiv"));
		a.add(new Employee(41, "rama"));
		a.add(new Employee(23, "shiva"));
		a.add(new Employee(31, "ram"));
		a.add(new Employee(14, "mohan"));
		for(Employee e : a) {
			System.out.println(e);
		}
		
	}
	
}

package sep29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
class Employee1{
	private int empId;
	private String empName;
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
	@Override
	public int hashCode() {
		return empId%10;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee1) {
			Employee1 e = (Employee1)obj;
			return empId == e.empId;
		}
		return false;
	}
	
}
public class CollectionDemo16 {

	public static void main(String[] args) {
		HashSet<Employee1> a = new HashSet<Employee1>();
		a.add(new Employee1(31, "ram"));
		a.add(new Employee1(13, "shiv"));
		a.add(new Employee1(41, "rama"));
		a.add(new Employee1(23, "shiva"));
		a.add(new Employee1(31, "ram"));
		a.add(new Employee1(14, "mohan"));
		for(Employee1 e : a) {
			System.out.println(e);
		}
		
	}
	
}

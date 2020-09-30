package sep30;

import java.util.Comparator;
import java.util.TreeSet;

class Employee3{
	int empId;
	String empName;
	public Employee3(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
}
class EmployeeComparator implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 arg0, Employee3 arg1) {
		return arg0.empId - arg1.empId;
	}
	
}

class EmployeeComparator1 implements Comparator<Employee3>{

	@Override
	public int compare(Employee3 arg0, Employee3 arg1) {
		return arg0.empName.compareTo(arg1.empName);
	}
	
}
public class CollectionDemo2 {

	public static void main(String[] args) {
		TreeSet<Employee3> a = 
				new TreeSet<Employee3>(new EmployeeComparator());
		a.add(new Employee3(31, "ram"));
		a.add(new Employee3(13, "shiv"));
		a.add(new Employee3(41, "rama"));
		a.add(new Employee3(23, "shiva"));
		a.add(new Employee3(31, "ram"));
		a.add(new Employee3(14, "mohan"));
		for(Employee3 e : a) {
			System.out.println(e);
		}
		System.out.println("==============================");
		a = new TreeSet<Employee3>(new EmployeeComparator1());
		a.add(new Employee3(31, "ram"));
		a.add(new Employee3(13, "shiv"));
		a.add(new Employee3(41, "rama"));
		a.add(new Employee3(23, "shiva"));
		a.add(new Employee3(31, "ram"));
		a.add(new Employee3(14, "mohan"));
		for(Employee3 e : a) {
			System.out.println(e);
		}
		
		
	}

}

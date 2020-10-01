package sep30;

import java.util.TreeSet;

class Employee2 implements Comparable<Employee2>{
	private int empId;
	private String empName;
	public Employee2(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	@Override
	public int compareTo(Employee2 o) {
		return empId - o.empId;
	}
	
}
public class CollectionDemo {

	public static void main(String[] args) {
		TreeSet<Employee2> a = new TreeSet<Employee2>();
		a.add(new Employee2(31, "ram"));
		a.add(new Employee2(13, "shiv"));
		a.add(new Employee2(41, "rama"));
		a.add(new Employee2(23, "shiva"));
		a.add(new Employee2(31, "ram"));
		a.add(new Employee2(14, "mohan"));
		for(Employee2 e : a) {
			System.out.println(e);
		}
		
	}

}

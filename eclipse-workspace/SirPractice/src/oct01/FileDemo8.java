package oct01;

import java.io.*;

class Employee implements Serializable{
	private int empId;
	private String empName;
	public Employee() {

	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
	
}

public class FileDemo8 {

	public static void main(String[] args)throws IOException {
		FileOutputStream f = 
				new FileOutputStream("E:\\cdac20\\dir\\my.txt");
		
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeObject(new Employee(101,"ram"));
				
		f.close();
		System.out.println("success");
	}

}

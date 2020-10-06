package oct05;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Employee{
	private int empId;
	private String empName;
	void setData(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	void showData() {
		System.out.println(empId+" "+empName); 
	}
}
public class ReflexionDemo {

	public static void main(String[] args) throws ClassNotFoundException, 
	InstantiationException, IllegalAccessException {
		Class ref = Class.forName("oct05.Employee");
		
		Employee emp = (Employee)ref.newInstance();
		
		emp.setData(101, "ram");
		emp.showData();
		
		Method m[] = ref.getDeclaredMethods();
		for(Method a : m) {
			System.out.println(a.getName());
			System.out.println(a.getParameterCount());
			for(Parameter p : a.getParameters()) {
				System.out.print(p.getType()+"  "); 
			}
			System.out.println();
		}
		
		Field f[] = ref.getDeclaredFields();
		
		for(Field fi : f) {
			System.out.println(fi.getName()+" : "+fi.getType()); 
		}

	}

}

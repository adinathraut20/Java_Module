class Person{
	Person(){
		System.out.println("no-arg Person");
	}
}
class Employee extends Person{
	Employee(){
		System.out.println("no-arg Employee");
	}
	Employee(int i){
		System.out.println("parameter Employee");
	}	
}

class EmployeeDemo11{
	public static void main(String args[]){
		Employee e = new Employee(12);
			
	}
}
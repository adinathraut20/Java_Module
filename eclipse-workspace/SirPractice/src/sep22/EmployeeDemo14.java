class Person{
	Person(){
		System.out.println("no-arg Person");
	}
     	Person(int i){
		System.out.println("param Person");
	}
}
class Employee extends Person{
	Employee(){
		// super(12);
		System.out.println("no-arg Employee");
		
	}
	Employee(int i){
		super(i);
		System.out.println("parameter Employee");
	}	
}

class EmployeeDemo14{
	public static void main(String args[]){
		Employee e = new Employee();
		Employee e1 = new Employee(12);	
	}
}
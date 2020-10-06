class Person{
/*	Person(){
		System.out.println("no-arg Person");
	}
*/
     	Person(int i){
		System.out.println("param Person");
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

class EmployeeDemo12{
	public static void main(String args[]){
		Employee e = new Employee();
		Employee e1 = new Employee(12);	
	}
}
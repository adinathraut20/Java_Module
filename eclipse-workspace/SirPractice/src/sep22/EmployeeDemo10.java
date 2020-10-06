class Person{
	void show(){
		System.out.println("person");
	}
}
class Employee extends Person{
	void show(){
		System.out.println("Employee");
	}
}
class Manager extends Employee{
	void show(){
		System.out.println("Manager");
	}	
}
class EmployeeDemo10{
	public static void main(String args[]){
		Person p = new Person();
		Person p1 = new Employee();
		Person p2 = new Manager();
/*		Person ar[] = {new Person(),
				new Employee(),
				new Manager()};
*/
		Person ar[] = {p2,p1,p};
		for(Person a : ar){
			a.show();
		}
		
	}
}
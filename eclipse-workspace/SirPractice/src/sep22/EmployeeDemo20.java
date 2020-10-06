class Person{
	void getDetail(){
		System.out.println("person details");
	}
	void getJob(){
		System.out.println("person job");
	}
}
class Employee extends Person{
	void getJob(){
		System.out.println("employee job");
	}
	void getDept(){
		System.out.println("employee dept");
	}
}
class EmployeeDemo20{
	public static void main(String args[]){
		Person ar[] = {new Employee(),new Person()}; 
		for(Person a : ar){
			if(a instanceof Employee){
			  Employee e = (Employee)a;
			  e.getDept();
			}
		}
	}
}
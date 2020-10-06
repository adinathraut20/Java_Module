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
class EmployeeDemo18{
	public static void main(String args[]){
		Person p = new Person();   // up casting
		Employee e = (Employee)p;    // down casting  
		e.getDetail();
		e.getJob();
		e.getDept();
		
	}
}
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
class EmployeeDemo17{
	public static void main(String args[]){
		Person p = new Employee();   // up casting
		p.getDetail();
		p.getJob();
	//	p.getDept();	
	}
}
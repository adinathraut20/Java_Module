class Foo{
	int i = 100;
	void m1(){
		System.out.println("m1 foo");
	}
}
class Bar extends Foo{
	 int i = 200;
	void m1(){
		super.m1();
		System.out.println("m1 Bar");
	}
	void show(){
	       System.out.println(i+"  "+super.i);
	}
}
class EmployeeDemo21{
	public static void main(String args[]){
		Bar b = new Bar();
		b.m1();
		b.show();
	}
}
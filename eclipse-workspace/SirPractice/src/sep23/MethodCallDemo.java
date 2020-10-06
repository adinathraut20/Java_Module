class Foo{
	static void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}

}
class MethodCallDemo{
	public static void main(String args[]){
		Foo.m1();
		new Foo().m2();	
		
	}
}
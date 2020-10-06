interface Foo{
	static void m1(){
		System.out.println("static inteface method");
	}
}
class Demo{
	public static void main(String args[]){
		Foo.m1();
	}
}
class Foo{
	static void m1(){
		System.out.println("Foo m1");
	}
}
class Bar extends Foo{
	static void m1(){
		System.out.println("Bar m1");
	}
	static void m2(){
		m1();
	}
}
class MethodHidingDemo{
	public static void main(String args[]){
		Foo f = new Bar();
		f.m1();
		Bar f1 = (Bar)f;
		f1.m1();
	}
}
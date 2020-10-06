class Foo{
	int i=345;
	static void m1(){
		System.out.println(new Foo().i);
	}
}
class MethodCallDemo3{
	int i = 100;
	static int j = 200;
	void m3(){
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String args[]){
	//	System.out.println(new MethodCallDemo3().i);
	//	System.out.println(j);
		Foo.m1();
	}
}
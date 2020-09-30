interface Foo{
	default void m1(){
		System.out.println("default inteface method");
	}
}
class Bar implements Foo{
	
}
class Demo1{
	public static void main(String args[]){
		Bar b = new Bar();
		b.m1();
	}
}
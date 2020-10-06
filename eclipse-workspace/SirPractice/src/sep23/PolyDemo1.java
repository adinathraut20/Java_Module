class Foo{
	void m1(){
		System.out.println("Foo m1");
	}

}
class Bar extends Foo{
	void m1(){
		System.out.println("Bar m1");
	}
}
class PolyDemo1{
	public static void main(String args[]){
		Foo f = new Bar();
		f.m1();
	}
}
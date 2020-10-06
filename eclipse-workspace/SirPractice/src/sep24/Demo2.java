class Outer{
	static class Foo{
		void m1(){
			System.out.println("static class");
		}
	}
}
class Demo2{
	public static void main(String args[]){
		Outer.Foo ref = new Outer.Foo();
		ref.m1();
	}
}
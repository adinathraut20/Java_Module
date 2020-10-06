package sep25.src.p1;
class A{
	void m1() {
		System.out.println("a");
	}
}

class B extends A{
	@Override
	void m1() {
		System.out.println("b");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		A a = new B();
		a.m1();

	}

}

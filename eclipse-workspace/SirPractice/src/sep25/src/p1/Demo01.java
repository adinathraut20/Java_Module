package sep25.src.p1;
@FunctionalInterface
interface E{
	void m1();
//	void m2();
}
class C{
	@Deprecated
	void m1() {
		System.out.println("m1 C");
	}
	void m2() {
		System.out.println("m2 C");
	}
}
class D extends C{
	
	void m2() {
		System.out.println("m2 D");
	}
}

public class Demo01 {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
//		c.m2();
	}

}

/* 47. Create a program to demonstrate constructor chaining.
*/


class A{
	private int x;
	A(){
		System.out.println("Class A constructor");
	}
	
	A(int x){
		System.out.println("Class A Parameterised Constrctor");
	}

}

class B extends A{
	private int y ;
	B(){
		super();
		System.out.println("Class B construtor");
	}
	B(int y){
		super(14);
		System.out.println("Class B Parameterised construtor");
	}
		
}

class Demo{
	public static void main(String []args){
		A a1 = new A();
		B b1 = new B();
		
		A a2 = new A(2);
		B b2 = new B(4);
	}
}

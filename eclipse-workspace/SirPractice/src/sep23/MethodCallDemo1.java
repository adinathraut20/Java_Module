class MethodCallDemo1{
	static void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
	public static void main(String args[]){
		MethodCallDemo1.m1();
		new MethodCallDemo1().m2();	
		m1();
		new MethodCallDemo1().m2();
	}
}
class MethodCallDemo2{
	static void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
	void m3(){
		m1();
		m2();
	}
	public static void main(String args[]){
		new MethodCallDemo2().m3();
	}
}
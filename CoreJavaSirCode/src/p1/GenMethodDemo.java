package p1;

public class GenMethodDemo {
	
	static <T> T show(T t) {
		System.out.println(t);
		return t;
	}

	static <T extends Number> T show1(T t) {
		System.out.println(t);
		return t;
	}
	
	public static void main(String[] args) {
		int i = show(123);
		
//		show(123.50);
//		show(true);
//		show("hello");

	}

}

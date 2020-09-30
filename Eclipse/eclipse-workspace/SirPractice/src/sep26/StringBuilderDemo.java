package sep26;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("abc");
//		StringBuffer s = new StringBuffer("abc");
		System.out.println(s);
		s.append("def");
		System.out.println(s);
		s.insert(3, "ABC");
		System.out.println(s);
		s.replace(3, 5, "RTYUIO");
		System.out.println(s);
		s.delete(3, 7);
		System.out.println(s);
		
		
		
	}

}

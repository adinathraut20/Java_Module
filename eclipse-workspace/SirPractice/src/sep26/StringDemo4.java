package sep26;

public class StringDemo4 {

	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "DEF";
		String s2 = s.concat(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("=======================");
		String s3 = "abc";
		s3 = s3.concat("def");
		System.out.println(s3);
	}

}

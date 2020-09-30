package sep26;

public class StringDemo1 {

	public static void main(String[] args) {
		String s = "Immutable Squence of Characters.";
		System.out.println(s);
		String s1 = s.toUpperCase();
		System.out.println(s1);
		String s2 = s.toLowerCase();
		System.out.println(s2);
		int len = s.length();
		System.out.println(len);
		char ch = s.charAt(10);
		System.out.println(ch);
		int j = s.indexOf('S');
		System.out.println(j);
		int k = s.lastIndexOf('t');
		System.out.println(k);
		String s3 = s.substring(10);
		System.out.println(s3);
		String s4 = s.substring(10,18);
		System.out.println(s4);

	}

}

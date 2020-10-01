package sep26;

public class StringDemo5 {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "ab";
		String s3 = "cd";
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		System.out.println("s1.equlas(s2) : "+(s1.equals(s2)));
		System.out.println("s1.equals(s3) : "+(s1.equals(s3)));
		
		System.out.println("============================");
		
		String s4 = new String("abc");
		String s5 = new String("abc");
		String s6 = new String("cde");
		System.out.println("s4==s5 : "+(s4==s5));
		System.out.println("s4==s6 : "+(s4==s6));
		System.out.println("s4.equlas(s5) : "+(s4.equals(s5)));
		System.out.println("s4.equals(s6) : "+(s4.equals(s6)));
		
		String s = "a";
		for(int i=0;i<10;i++) {
			s += "a";
//			s += new String("a");
		}
		
		
		
	}

}

package oct03;

public class GcDemo {

	public static void main(String[] args) {
		String s = new String("abc");
		String s1 = new String("abcghj");
		s = null;
//		String s3 = s1;
		s1 = s;		
		System.out.println("===");
		
	}

	
}

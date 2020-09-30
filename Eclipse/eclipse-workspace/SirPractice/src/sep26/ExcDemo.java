package sep26;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("started");
		String s1 = "12";
		String s2 = "0";
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		try {
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}
		System.out.println("finished");
	}

}

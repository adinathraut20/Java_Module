package sep26;

public class ExcDemo7 {

	public static void main(String[] args) {
		System.out.println("started");
		String ar[] = {"12","0"};
		try {	
			String s1 = ar[0];
			String s2 = ar[1];
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			int k = i/j;
			System.out.println(k);
		}catch (ArithmeticException e) {
			System.out.println(e);
		}catch(Exception abc) {
			System.out.println(abc);
		}
		System.out.println("finished");
	}

}

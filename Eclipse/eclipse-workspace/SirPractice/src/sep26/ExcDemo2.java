package sep26;

public class ExcDemo2 {

	public static void main(String[] args) {
		System.out.println("started");
		String ar[] = {"12","g"};
		try {	
			String s1 = ar[0];
			String s2 = ar[1];
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}catch(NumberFormatException e) {
			System.out.println("give num only");
		}catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("provide 2 nums");
		}
		System.out.println("finished");
	}

}

package sep26;

public class ExcDemo6 {

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
		}finally {
			System.out.println("close the resources");
		}
		System.out.println("finished");
	}

}

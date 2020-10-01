package sep28;

public class WrapperDemo2 {

	public static void main(String[] args) {
		
		Integer r  = new Integer(12);
		int i = r.intValue();             // un boxing
		
		System.out.println(i);
		
		int j = new Integer(56);         // auto unboxing 
		System.out.println(j);
		
		
		Integer k = new Integer(33);
		Integer p = new Integer(67);
		Integer t = k + p;
		System.out.println(t);
		
		int n1 = 10;
		int n2 = 20;
		int n = n1 + n2;
		System.out.println(n);
				
		
		
		
		
	}

}

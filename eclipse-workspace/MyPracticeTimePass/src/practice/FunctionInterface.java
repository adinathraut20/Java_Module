package practice;


interface MyInf{
	boolean fun(int n);
}



public class FunctionInterface {
		static void check(MyInf o, int n) {
			if(o.fun(n)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int num = 345;
			check(n -> {int r=n;
						  int rem = 0;
						  int rev = 0;
						  while(r!=0) {
							  rem = r%10;
							  rev = rev*10 + rem;
							  r = r/10;
							  }
						  	return rev==n;
						  },num);
			
			
	}

}

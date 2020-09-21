// Program to find factorial

import java.util.*;

class for2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to find Factorial : ");
		int n = sc.nextInt();
		int fac = 1;
		for(int i=1;i<=n;i++){
			fac*=i; //fac = fac * i
		}
		
		System.out.println("Factorial is : " + fac);
	}
}
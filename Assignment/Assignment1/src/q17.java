/* 17. Write a program to reverse a given number.
*/


import java.util.*;

class ReverseNo{
	public static void main(String []args){
		System.out.println("Enter no to reverse by String buffer :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println(str1);
		System.out.println("Enter no to reverse by String rev : ");
		String str2 = sc.next();
		for(int i=str2.length()-1;i>=0;i--){
			System.out.print(str2.charAt(i));
		}
	
		
		System.out.println("\nEnter no to reverse by Calculation : ");
		String str4 = sc.next();
		int arr = Integer.parseInt(str4);
		int rev=0;
		int rem;
		int r;
		while(arr > 0){
			r = arr%10;
			rev = rev*10 + r;
			arr = arr/10;
		}
		System.out.println(rev);
	}
}
		

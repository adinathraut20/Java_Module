// check whether no is Palindrome or not 

import java.util.*;

class for3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String  : ");
		String Str = sc.next();
		int n = Str.length();
		
		int flag = 0; 
		
		for(int i=0;i<n/2;i++){
			if(Str.charAt(i) != Str.charAt(n-i-1)){
				flag =1;
				break;
			}
		}
		if(flag == 1){
			
			System.out.println(Str + "  String is not a Palindrome");
		}
		else{
			System.out.println(Str + "  String is Palindrome");
		}
	}
}
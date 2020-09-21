// check the occurence of no. in given no 

import java.util.*;

class for6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");    //
		int n = sc.nextInt();
		System.out.println("Enter the no. whose occurence to check : ");
		int d = sc.nextInt();  //
		int count = 0;
		for(int i=0;i<n;i++){  //
			if(n%10 == d)  //
			{
				count++;  
			} 
			n=n/10;
				
		}
			
		
		
			System.out.println("No of Occurence of "+ d + " : " + count);
			
	}
}
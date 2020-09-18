/* 25. Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/


import java.util.*;
	
class SumEvenOdd {
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of element to enter : ");
			int n = sc.nextInt();
			System.out.println("Enter Array Element : ");
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int sumE=0;
			int sumO=0;

			for(int i=0;i<n;i++){
				if(arr[i]%2 == 0){
					sumE+=arr[i];
				}
				else{
					sumO+=arr[i];
				}
			}
			System.out.println("Sum of Even Elements : "+sumE+"\nSum of Odd Elements : "+sumO);
		}
}
						

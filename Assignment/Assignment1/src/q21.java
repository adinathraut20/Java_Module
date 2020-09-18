/* 21. Program to show sum and average of 10 element array. Accept array elements from user. 
*/


import java.util.*;
	
class SumAverageArray {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Element to Enter : " );
		int n = sc.nextInt();
		System.out.println("Enter Array elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		double Avg = (double) (sum/n);
		System.out.println("Sum : "+sum+" Avarage : "+Avg);
		}
	}		

/* 23. Write a program to reverse the array elements.
*/


import java.util.*;
	
class ReverseArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n/2;i++){
			int temp = arr[i];
			arr[i] = arr[(arr.length)-i-1];
			arr[(arr.length)-i-1] = temp;
		}
		System.out.println("");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}
}

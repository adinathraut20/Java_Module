/* 27. Write a program to fine the smallest and greatest number present in the array of integer type.
*/

import java.util.Scanner;

class FindSmallnLarge{

	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i] > max){
				max =arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Greatest number is : " + max + "\nSmallest number is : " + min);
	}
}

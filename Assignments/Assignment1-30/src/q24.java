/* 24. Write a program to search an element in the array.
*/


import java.util.Scanner;

class SearchElement {
	public static void main(String []args){
		System.out.println("Enter no of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Array Element : ");
		boolean flag = false;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to search : ");
		int n1 = sc.nextInt();

		for(int i=0;i<n;i++){
			if(arr[i] == n1 ){
				flag = true;
				break;
			}
		}
		if(flag == true){
				
				System.out.println(n1+" Found !!!");
		}
		else{
				System.out.println(n1+" Not Found !!!");
		}
	}
}

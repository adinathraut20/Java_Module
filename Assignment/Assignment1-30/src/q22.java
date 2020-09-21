/* 22. Sort a ten element array in descending order.
*/


import java.util.*;

class SortDescend{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int arr[]=new int[n];
		System.out.println("Enter 10 elements of array : ");
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

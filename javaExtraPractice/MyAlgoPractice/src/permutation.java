

import java.util.*;
import java.util.Scanner;

class Permutation{

	public static void permute(int a[], int k,final int m){
			if(m==k){
				//System.out.println(k +" "+m);
				for(int i=0;i<=m;i++){
					System.out.print(a[i]+" ");
				}
				System.out.println("");
			}
			else{
				for(int i=k;i<=m;i++){
					//System.out.println(k +" "+m);
					swap(a,k,i);
					permute(a,k+1,m);
					swap(a,k,i);
				}
			}
	}
	public static void swap(int a[],int k,int m){
			int temp = a[k];
			a[k] = a[m];
			a[m] = temp;
		}
	public static void main(String args[]){
		
		System.out.println("Enter no of Elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		permute(arr,0,n-1);
	}
}
			
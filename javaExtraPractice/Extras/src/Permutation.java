
import java.util.Scanner;

class Permutation{
	
	public static void permute(int a[],int k, int m){
			if(k==m){
				for(int i: a){
					System.out.print(i+" ");
				}
				System.out.println("");
			}
			else{
				for(int i=k;i<=m;i++){
					swap(a,k,i);
					permute(a,k+1,m);
					swap(a,k,i);
				}
			}
		}
	public static void swap(int arr[],int k,int i){
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
			}
	public static void main(String args[]){
			
			System.out.println("Enter no. of element : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter elements : ");
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			permute(arr,0,n-1);
	}
}
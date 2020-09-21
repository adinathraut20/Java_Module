/* 26. Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
*/


import java.util.Scanner;

class SumCal2D {
		public static void main(String []args){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Row and Column : ");
				int r = sc.nextInt();
				int c = sc.nextInt();
				System.out.println("Enter Array Elements : ");
				int arr[][] = new int[r][c];
				for(int i=0;i<r;i++){
					for(int j=0;j<c;j++){
						arr[i][j] = sc.nextInt();
					}
				}
				int sum=0;
				for(int i=0;i<r;i++){
					for(int j=0;j<c;j++){
						sum += arr[i][j];
					}
				}
				System.out.println("Sum of all Elements : "+sum);

				//Using For Each loop
				int sum1 = 0;
				for(int arr1[] : arr){
					for(int i : arr1){
						sum1+=i;
					}
				}
				System.out.println("Sum of all Elements with for each loop : "+sum1); 
			}
}	

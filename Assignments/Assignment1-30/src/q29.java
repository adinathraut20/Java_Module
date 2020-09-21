/* 29. Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.
*/

import java.util.Scanner;

class NoOfElements1D {
	public static void main(String []args){
		System.out.println("Enter no of Rows and Column : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter 2D array Elements : ");
		int arr[][] = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int twoDA = arr.length;
		int arrlen [] = new int[twoDA];
		for(int i=0;i<twoDA;i++){
			arrlen[i] = arr[i].length;
		}
		System.out.println("Total no. of 1-D arrays : " + twoDA);
		for(int i=0;i<arrlen.length;i++){
			System.out.println("Length of Array "+(i+1)+" is " + arrlen[i]);
		}
	}
}
		

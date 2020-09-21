/* 16. Write a program to print table of any entered number using loop.
*/


import java.util.Scanner;

class Tables{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.to print the table : ");
		int no = sc.nextInt();

		for(int i=1;i<=10;i++){
			
				System.out.println(i*no); 
			
		}
	}
}

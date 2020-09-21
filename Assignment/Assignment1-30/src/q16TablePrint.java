/* 16. Write a program to print table of any entered number using loop.
*/


import java.util.Scanner;

class TableNo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.to print the table : ");
		int no = sc.nextInt();
		System.out.println(" +--------------+");
		for(int i=1;i<=no;i++){
			if(i<10){
				System.out.println(" |     "+i+"        |"); 
			}
			else if(i<100){
				System.out.println(" |     "+i+"       |");
			}
			else if(i<1000){
				System.out.println(" |    "+i+"       |");
			}
			else if(i<10000){
				System.out.println(" |    "+i+"      |");
			}
			else if(i<100000){
				System.out.println(" |   "+i+"      |");
			}
			else{
				System.out.println(" |  "+i+"    |");
			}
			System.out.println(" +--------------+");
		}
	}
}

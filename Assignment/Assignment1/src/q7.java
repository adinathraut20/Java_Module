/* 7. Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
*/


import java.util.Scanner;
	
class MarkCalculate {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int[]  arr= new int[5];
		int Sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Subject "+(i+1)+" Marks : ");
			arr[i] = sc.nextInt();
			Sum+=arr[i];
		}
		double percent = (Sum*100)/500;
		System.out.println("Perecentage Marks : "+percent+" %");
	}
}
		
			

/* 8. Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.
*/

import java.util.Scanner;

class SimpleInterest {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount : ");
		double Amount = sc.nextDouble();
		System.out.println("Enter Rate of Interest : ");
		double interest = sc.nextDouble();
		System.out.println("Enter Time period in Yrs : ");
		double time = sc.nextDouble();
		double si = (Amount*interest*time)/100;
		System.out.println("Simple Interest : "+si+" (Rs)");
		}
}

/* 14. Program to check that entered year is a leap year or not.
*/


import java.util.Scanner;

class LeapCheck{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		String str = (year%400 == 0 || (year%100 != 0 && year%4 == 0)) ? (year+" is a leap year") : (year+" is not a leap year");
		System.out.println(str);
		}
}

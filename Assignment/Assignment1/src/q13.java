/* 13. Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
*/


import java.util.Scanner;

class CompareNo{
	public static void main(String []args){
			System.out.println("Enter 3 no. : ");
			Scanner sc = new Scanner(System.in);
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int s3 = sc.nextInt();
			String str = (s1>s2 && s1>s3) ? ("Greatest no. is : "+s1) : ((s2>s1 && s2>s3) ? ("Greatest no. is : "+s2) : ((s3>s1 && s3>s2) ? ("Greatest no. is : "+s3) : ("All are equal")));
			System.out.println(str);
			}
}

import java.util.Scanner;

public class Days{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE DAYS : ");
		int days= sc.nextInt();
		int year = days/365;
		days=days%365;
		System.out.println("YEAR : "+ year);
		int week = days/7;
		days=days%7;
		System.out.println("WEEK : "+ week);
		System.out.println("DAY : "+ days);
		
	
	}



}

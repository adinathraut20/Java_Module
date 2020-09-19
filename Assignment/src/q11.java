/* 11. Write a program to swap two numbers without using third variable.
*/

import java.util.Scanner;

class Swap{
	public static void main(String []args){
			System.out.println("Enter nos. to Swap : ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Variable 1 : ");
			int var1 = sc.nextInt();
			System.out.println("Enter Variable 2 : ");
			int var2 = sc.nextInt();
			int temp = var1;
			var1 = var2;
			var2 = temp;
			System.out.println("AfterSwap :\nVariable 1 : "+var1+"\nVariable 2 : "+var2);
			System.out.println("Enter Variable 1 : ");
			int a = sc.nextInt();
			System.out.println("Enter Variable 2 : ");
			int b = sc.nextInt();
			System.out.println("Before Swapping Variable 1 :"+a+" Variable 2 :"+b);
			a=a+b;
			b=a-b;
			a=a-b;
			//Swap one line code
			//b = (a+b)-(a=b);

			System.out.println("After Swapping Vairable 1 :"+a+" Variable 2 :"+b);
			}
	}



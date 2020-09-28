/* 54. Write a program to reverse the given String.
 * 
 */

package p51_60;

import java.util.Scanner;

public class q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to Reverse : ");
		String str = sc.nextLine();
		StringBuilder input1 = new StringBuilder(str);
		input1 = input1.reverse();
		System.out.println("\nReverse String : " +input1);
		sc.close();
	}
	
}

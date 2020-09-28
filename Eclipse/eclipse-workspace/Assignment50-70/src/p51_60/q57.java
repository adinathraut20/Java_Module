/* 57. Write a program to reverse every word of the String.
 * 
 */

package p51_60;

import java.util.Scanner;

public class q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter the String to Reverse : ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			str = str.trim();
			char [] ch = str.toCharArray();
			for (int i = 0; i < ch.length/2; i++) {
				char c = ch[i];
				ch[i] = ch[ch.length-i-1];
				ch[ch.length-i-1] = c;
				
			}
			System.out.println("Revese String is : ");
			for (char c1 : ch) {
				System.out.print(c1);
				
			}			
			sc.close();
	}

}

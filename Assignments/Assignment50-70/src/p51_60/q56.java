/* 56. Write a program to convert very first character of every word in uppercase in a String.
 * 
 */

package p51_60;

import java.util.Scanner;

public class q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String [] arr = str.split("[\\s]+");
		for (int i = 0; i < arr.length; i++) {
			int s = arr[i].charAt(0);
			if(s>96) {
				s = s -32;
			}
			char c = (char) s;
			arr[i] = c + arr[i].substring(1);
		}
		for (String st1 : arr) {
			System.out.println(st1);
		}
		sc.close();
	}

}

/* 58. Store name of weekdays in an array (starting from “Sunday” at 0 index).
 *  Ask day position from user and print day name. Handle array index out of bound exception 
 *  and give proper message if user enter day index outside range (0-6). 
 * 
 */

package p51_60;

import java.util.Scanner;

public class q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []week = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			try {
				System.out.println("Enter no from 0-6 :\nEnter 8 to EXIT");
				int i = sc.nextInt();
				if(i == 8) {
					break;
				}
				System.out.println("You choose is : "+week[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		sc.close();
	}

}

/* Q. Write a program to check if an array contains a value or not in Java?

Array 1: [12, 34, 45,65, 76]
Num: 23
 output: Not present
num : 65
present
*/

package ArrayQuestions;

import java.util.Scanner;

public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {12,34,45,65,76};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for (int i : arr) {
			if(i == num) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}
		sc.close();
	}

}

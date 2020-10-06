/* 53. Input data exactly in the following format, and 
 * print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”. 
 *   (Hint use String class split method and Integer class parseInt method) .
 */
package p51_60;

import java.util.Scanner;

public class q53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String[] st = str.split(",\\s");  //", "
		int[] arr = new int[st.length];
		for (int i = 0; i < st.length; i++) {
			arr[i] = Integer.parseInt(st[i]);
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		sc.close();
	
	}

}
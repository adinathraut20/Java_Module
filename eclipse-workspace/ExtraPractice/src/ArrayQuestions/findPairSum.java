/* how to find all pairs of an integer array whose sum is equal to a given array
 * 
 */

package ArrayQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class findPairSum {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of Array : ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter Elements : ");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter Sum whose pair to search : ");
			int sum = sc.nextInt();
			//By simple Method
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]+arr[j] == sum) {
						System.out.println(arr[i]+ ", "+ arr[j]);
					}
				}
			}
			System.out.println("");
			//By using HashSet
			HashSet<Integer> hSet1 = new HashSet<Integer>();
			for(int i : arr) {
				hSet1.add(sum-i);
			}
			for(int i : arr) {
				if(hSet1.contains(i)) {
					System.out.println(i+", "+(sum-i));
					hSet1.remove(sum-i);
				}
			}

	}

}

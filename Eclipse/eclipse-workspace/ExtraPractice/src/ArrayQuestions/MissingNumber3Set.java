/* Q. How do you find the missing number in a given integer array of 1 to 100?
Size of array : 10
Array Element: [1, 3 , 5, 6, 7, 9]
Missing Element: 2,4,8,10.
*/

package ArrayQuestions;

import java.util.HashSet;

public class MissingNumber3Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,3,5,6,7,9,50};

		HashSet<Integer> hSet1 = new HashSet<Integer>();
	
		for (int i = 0; i<arr.length;i++) {
			hSet1.add(arr[i]);
		}
		int len = arr.length;
		int count = 0;
		for (int j = 1; j <= 100; j++) {
			if(count <= len) {
				
				if(hSet1.contains(j)) {
					count++;
					continue;
				}
			}
			System.out.print(j+", ");
			
		}
		
	}

}


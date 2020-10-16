/* How to remove duplicate elements from array
 * 
 */

package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
			
			//By simple for loop
		
			int arr[] = {1,1,2,3,4,5,2,7};
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			Arrays.sort(arr);
			int prev = arr[0];
			arr1.add(arr[0]);
			for (int i=1;i<arr.length;i++) {
				if(arr[i]==prev) {
					continue;
				}else {
					arr1.add(arr[i]);
					prev = arr[i];
				}
			}
			System.out.println(arr1);
			
			//By Using HashSet
			
			HashSet<Integer> hSet1 = new HashSet<Integer>();
			for (int i : arr) {
				hSet1.add(i);
			}
			int arr3[] = new int[hSet1.size()];
			int j=0;
			for (Iterator iterator = hSet1.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				arr3[j] = integer;
				j++;
				System.out.print(integer+", ");
			}

	}

}

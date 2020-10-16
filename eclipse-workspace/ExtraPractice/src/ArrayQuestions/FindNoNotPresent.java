/* Given two array 1,2,3,4,5 and 2,3,1,0,5 find which no is not present in the second
 * array
 */

package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindNoNotPresent {

	public static void main(String[] args) {
			
			int arr[] = {1,2,3,4,5};
			int arr1[] = {2,3,1,0,5};
			
			//By Using simple for loop
			Arrays.sort(arr1);
			for (int i = 0,j=0; i < arr.length; ) {
				if(arr[i] == arr1[j]) {
					i++;
					j++;
					continue;
				}
				else if(arr[i]>arr1[j]) {
					
					j++;
					continue;
				}else {
					System.out.println(arr[i]);
					i++;
					continue;
				}
			}
			
			//by Using HashSet
			HashSet<Integer> hSet1 = new HashSet<Integer>();
			for (int i : arr) {
				hSet1.add(i);
			}
			for(int i : arr1) {
				if(hSet1.contains(i)) {
					hSet1.remove(i);
				}
			}
			for (Iterator iterator = hSet1.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
				
			}
			
		
	}

}

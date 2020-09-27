/* Q. Write a program to repeat a number in a given array by two times?

Array 1: [1,2,3]
Output: [1,1,1,2,2,2,3,3,3]
*/

package ArrayQuestions;

public class RepeatNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {1,2,3};
		int len1 = (arr.length)*3;
		int []arr1 = new int [len1];
		int repeatNo = 3;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j2 = 0; j2 < repeatNo; j2++) {
				
				arr1[j] = arr[i];
				j++;
			}
		}
		
		for (int i : arr1) {
			System.out.print(i+", ");
		}
	}

}

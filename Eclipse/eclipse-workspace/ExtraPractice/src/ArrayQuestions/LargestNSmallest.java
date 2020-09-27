/* Q. Write a program to find the smallest and the largest number in an array ?

Array 1: [12, 34, 45,65, 76]
Min: 12
Max: 76
*/

package ArrayQuestions;

public class LargestNSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {12,34,45,65,76};
		int min = arr[0];
		int max = arr[0];
		for (int i : arr) {
			if(min > i) {
				min = i;
			}
			if(max < i) {
				max = i;
			}
		}
		System.out.println("Max : "+max+"\nMin : "+min);
	}

}

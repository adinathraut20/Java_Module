/* Q. How do you find the missing number in a given integer array of 1 to 10?
Size of array : 10
Array Element: [1, 3 , 5, 6, 7, 9]
Missing Element: 2,4,8,10.
*/

package ArrayQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,3,5,6,7,9};
		int miss1 = arr[0];
		miss1++;
		for (int i = 1; i<arr.length; ) {
			
			if(arr[i] != miss1) {
				System.out.print(miss1+", ");
			}
			if(arr[i]>miss1) {
				miss1++;	
			}
			else if(arr[i]<miss1) {
				i++;
			}
			else {
				i++;
				miss1++;
			}
			
			
		}
		for (int j = miss1; j <= 10; j++) {
			System.out.print(j+", ");
			
		}
	}

}

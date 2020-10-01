/* Q. Write a program to find intersection of two sorted arrays in Java?

Array 1: [12, 34, 56, 67, 89]
Array 2: [21,56, 78,90]
Intersection: 56
*/

package ArrayQuestions;

public class IntersctionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr1 = new int [] {12, 34, 56, 67, 89};
			int []arr2 = new int [] {21, 56, 78, 90};
			int arr1len = arr1.length;
			int arr2len = arr2.length;
			
			int intersect = -1;
			for (int i = 0,j = 0; i <arr1len && j<arr2len ; ) {
				if(arr1[i] == arr2[j]) {
					intersect = arr1[i];
					break;
				}
				else if(arr1[i] < arr2[j]) {
					i++;
					continue;
				}
				else {
					j++;
					continue;
				}
			}
			System.out.println("Intersection : "+intersect);
		
	}

}

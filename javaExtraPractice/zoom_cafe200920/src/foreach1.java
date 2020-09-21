// for Each loop

import java.util.*;

class foreach1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = { 1,3,5,7,9,11,13,15,17};
		
		for(int i : arr){
			System.out.println(i);    //
		}
	}
}
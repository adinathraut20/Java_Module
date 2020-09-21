// for each loop to print 2D Array

import java.util.*;

class foreach3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = { {{2,41,2,3},,5},{54,6,7}};
		
		for(int [] i : arr){
			for(int j : i){
				System.out.println(j);    //
			}
		}
	}
}
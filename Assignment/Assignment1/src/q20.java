/* 20. Print all prime numbers between two given numbers. [ break continue ]
*/

import java.util.*;

class RangePrimePrint{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nos. between which all prime no is to print : ");
		int start = sc.nextInt();
		int end = sc.nextInt();

		for(int i=start;i<=end;i++){
			boolean flag = false;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j == 0){
					flag = true;
					break;
				}
			}
			if(flag == false && i>1){
				System.out.println(i);
			}
		}

	}
}

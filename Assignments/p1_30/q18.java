/* 18. Program to check whether number is prime or not.
*/

import java.util.*;

class CheckPrime{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. the check Prime : ");
		int nos = sc.nextInt();
		boolean flag = false;
		for(int i=2;i<Math.sqrt(nos);i++){
			if(nos%i == 0){
				flag = true;
				break;
			}
		}
		if(flag == false && nos>=2) {
			System.out.println(nos+" is Prime No.");
		}
		else{
			System.out.println(nos+" is not Prime No. ");
		}
	}
}

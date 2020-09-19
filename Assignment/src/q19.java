/* 19. Calculate  series : 12+22+32+42+.........+n2
*/

import java.util.Scanner;

class CalculateSeries {
	public static void main(String []args){
		System.out.println("Enter nth to find Sum of Series : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int Sum=12;
		int Sum1=12;
		for(int i=1; i<number ; i++){
			Sum+=10;
			Sum1+=Sum;
		}
		System.out.println("Sum of Series is : "+Sum1);
	}
}

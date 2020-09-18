/* 15. Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.
*/


import java.util.Scanner;

class MarriageEligibility{
	public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Person's Age : ");
			int Age = sc.nextInt();
			System.out.println("Enter Person's Gender 'm' or 'f' : ");
			char ch = sc.next().charAt(0);
			if( ch == 'm' && Age >=21){
				System.out.println("Person is Eligible for Marriage");
			}
			else if ( ch == 'f' && Age >=18){
				System.out.println("Person is Eligible for Marriage");
			}
			else{	
				System.out.println("Person is not Eligible for Marriage");
			}
		}
}

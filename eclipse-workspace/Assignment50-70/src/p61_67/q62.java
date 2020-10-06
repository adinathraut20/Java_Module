/* 62. Create a class that checks whether a given number is prime or not 
 * using  Runnable interface.
 */

package p61_67;

import java.util.Scanner;

class CheckPrime implements Runnable{
	int no ;
	boolean flag;
	CheckPrime(int n){
		no = n;
		flag = true;
	}
	public void run() {
		for(int i=2;i<=no/2;i++) {
			if((no%i) == 0){
				flag = false;
				System.out.println("Not Prime");
				break;
			}
			
		}
		if(flag) {
			System.out.println("Prime No");
		}
	}
}

public class q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started....");
		System.out.println("Enter No. :");
		Scanner sc = new Scanner(System.in);
		CheckPrime c1 = new CheckPrime(sc.nextInt());
		Thread t1 = new Thread(c1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main finished");
		sc.close();

	}

}

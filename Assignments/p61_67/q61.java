/* 61. Create a Thread class to print following star (*) pattern on screen 
 * with delay of 1 second between each * print. Number of lines in the pattern 
 * should be passed to the constructor of Thread class. 
 *  *  
 *  * * 
 *  * * * 
 *  * * * * 
 *  * * * * *
 *   Use this class in main method and 
 *  ask user to enter number of lines to print.
 */

package p61_67;

import java.util.Scanner;

class MyThread extends Thread{
	int no;
	MyThread(int n){
		no = n;
	}
	@Override
	public void run() { 
		try {
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			
			}						 
			System.out.println("");
			Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}                                     
}


public class q61 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		System.out.println("Enter no of lines : ");
		Scanner sc = new Scanner(System.in);
		MyThread th = new MyThread(sc.nextInt());           
		th.start();  		
		System.out.println("main finished"); 
		sc.close();
		
	}

}

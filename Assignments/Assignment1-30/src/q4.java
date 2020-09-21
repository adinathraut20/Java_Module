/* 4. Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .

*/
import java.lang.*; 

class byteDownCast {
	public static void main(String []args){
		byte b1 = 21;
		byte b2 = 20;

		//Downcasting from int to byte due to byte overflow
		byte b3 = (byte) (b1 + b2 );
		int b4 = b1 + b2;
		System.out.println("Byte variable with Down Cast Value = "+b3);
		System.out.println("Integer variable without Cast Value = "+b4);
	}
}

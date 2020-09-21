/* error: constructor A in class A cannot be applied to given types;
		public q11(String s){
		                    ^
  required: String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

*/

import java.util.*;

class A{
	public A(String s){
		System.out.print("A");
	}
}

public class q11 extends A{
		public q11(String s){
			//super(s);
			System.out.print("q11");
		}
		public static void main(String []args){
			new q11("C");
			System.out.println(" ");
		}
}

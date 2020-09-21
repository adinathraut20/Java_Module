/* o/p : Class A
	 Class B
	 Class C
*/

import java.util.*;
	
class A{
	String s = "Class A";
}

class B extends A{
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}

class C extends B{
		String s = "Class C";
		{
			System.out.println(super.s);
		}
	}
	
public class q5 {
	public static void main(String []args){
		C c = new C();
		System.out.println(c.s);
	}
}

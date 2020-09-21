/* error: integer number too large
		int y = 08;
		        ^
1 error
*/

import java.util.*;

class main{
	public static void main(String []args){
		short s = 0;
		int x = 07;
		int y = 08;
		int z = 112345;

		s += z ;
		System.out.println("" + x + y + s);
	}
}

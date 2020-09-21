/* error: '{' expected
class Z extends X,Y{
                 ^
1 error
*/


import java.util.*;

class X{
}

class Y{}

class Z extends X,Y{
	public static void main(String []args){
		Z z1 = new Z();
	}
}

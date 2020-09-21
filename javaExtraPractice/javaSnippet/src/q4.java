// below code is showing compile error

/* error: constructor X in class X cannot be applied to given types;
	public Y(){
	          ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

*/ 

import java.util.*;

class X{
	public X(int i){
		System.out.println(1);
	}
}


class Y extends X{
	public Y(){
	
		System.out.println(2);
	}
}

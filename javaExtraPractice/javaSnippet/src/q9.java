/* error: foo() in Derived cannot override foo() in Base
	void foo(){}
	     ^
  attempting to assign weaker access privileges; was protected
1 error
*/

import java.util.*;

class Base{
	protected void foo(){}
}

class Derived extends Base{
	void foo(){}
}

public class q9{
	public static void main(String args[]){
		Derived d = new Derived();
		d.foo();
	}
}

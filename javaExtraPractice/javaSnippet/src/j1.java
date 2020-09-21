/* o/p : main  
beacuse int E() is consider as method construtor doesnt have data type
*/



import java.util.*;

class E{
	int i=10;
	int E(){ System.out.println("E");
		return 30;}
	public static void main(String []args){
		E  E1 = new E();
		System.out.println("main");
	}
}

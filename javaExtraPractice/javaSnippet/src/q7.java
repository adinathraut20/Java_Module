// o/p : 20

import java.util.*;

public class q7 {
	int num = 100;
	public void calc(int num){
		this.num = num*10;
	}
	public void printNum(){
		System.out.println(num);
	}
	
	public static void main(String []args){
		
		q7 obj = new q7();
		obj.calc(2);
		obj.printNum();
	}
}

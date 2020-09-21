// o/p : alpha beta b b


import java.util.*;

class Alpha{
		public String type = "a ";
		public Alpha(){
			System.out.print("alpha ");
		}
}

public class q2 extends Alpha {
		public q2(){
			System.out.print("beta ");
		}
		
	void go(){
		type = "b ";
		System.out.print(this.type + super.type);
	}
	
	public static void main(String[] args){
		new q2().go();
	}
}

// o/p : 2 3


import java.util.*;

class A{
	int i;
}

class B extends A{
		int j;
		void display(){
		{
			super.i = j+1;
			System.out.println(j + " " + i);
		}
	}
}
class q15 {
		public static void main(String args[]){
			B obj = new B();
			obj.i = 1;
			obj.j = 2;
			obj.display();
		}
}

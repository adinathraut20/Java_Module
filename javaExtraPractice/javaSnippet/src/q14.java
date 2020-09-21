// o/p : 10
// a is of type A so i will be 10


import java.util.*;

class A{
	int i = 10;
}


class B extends A{
	int i = 20;
}

class MainC{
		public static void main(String []args){
			A a = new B();
			System.out.println(a.i);
		}
}

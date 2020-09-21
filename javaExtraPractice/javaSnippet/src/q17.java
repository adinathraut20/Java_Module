// o/p : 1 2 3


class A{
		{
			System.out.println(1);
		}
}


class B extends A{
		{
			System.out.println(2);
		}
}

class C extends B {
		{
			System.out.println(3);
		}
}

public class q17{
		public static void main(String []args){
			C c = new C();
		}
}

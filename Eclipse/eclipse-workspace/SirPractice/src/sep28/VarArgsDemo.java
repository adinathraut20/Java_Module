package sep28;

public class VarArgsDemo {
	
	static void show(int... ar) {
		System.out.println("Called for : ");
		for(int a : ar) {
			System.out.print(" "+a);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		show();
		show(12);	
		show(12,13,14,15,16);
		int ar[] = {1,2,3,4,5,6,7,8};
		show(ar);
	}

}

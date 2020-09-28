package sep28;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	void m1() throws IOException{
		System.out.println("m1 A");
		throw new IOException();
	}
}
class B extends A{
	void m1() throws FileNotFoundException{
		System.out.println("m1 B");
	}
}
public class OverridingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

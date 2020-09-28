package sep28;

import java.io.IOException;

public class CheckedExceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("remaining prg");
		}
	}
	static void m1() throws IOException{
		m2();
	}
	static void m2() throws IOException{
		throw new IOException();
	}

}

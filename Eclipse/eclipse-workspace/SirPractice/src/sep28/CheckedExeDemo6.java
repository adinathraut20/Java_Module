package sep28;

import java.io.IOException;

public class CheckedExeDemo6 {
	public static void main(String[] args)throws IOException {
		m1();
		System.out.println("remaining prg");
	}	
	static void m1() throws IOException {
		m2();
	}	
	static void m2() throws IOException {
		throw new IOException();
	}

}

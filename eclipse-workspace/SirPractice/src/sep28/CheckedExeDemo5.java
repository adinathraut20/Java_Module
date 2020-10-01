package sep28;

import java.io.IOException;

public class CheckedExeDemo5 {
	public static void main(String[] args) {
		try {
			m1();
		}catch (IOException e) {
			System.out.println("exception handled");
		}
		System.out.println("remaining prg");
	}	
	static void m1() throws IOException {
		m2();
	}	
	static void m2() throws IOException {
		throw new IOException();
	}

}

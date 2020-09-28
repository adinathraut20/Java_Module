package sep28;

import java.io.IOException;

public class CheckedExceDemo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			m1();
			System.out.println("remaing part");
	}
	static void m1() throws IOException{
		m2();
	}
	static void m2() throws IOException{
		throw new IOException();
	}

}

package sep28;

import java.io.IOException;

public class CheckedExeDemo4 {
	public static void main(String[] args) {
		try {
		m1();
		}catch (IOException e) {
			
		}
	}	
	static void m1() throws IOException {
		m2();
	}	
	static void m2() throws IOException {
		System.out.println("Enter any char");
		int j = System.in.read(); 
		System.out.println("u entered "+(char)j);
	}

}

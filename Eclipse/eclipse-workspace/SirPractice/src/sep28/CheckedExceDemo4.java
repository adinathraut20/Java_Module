package sep28;

import java.io.IOException;

public class CheckedExceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void m1() throws IOException{
		m2();
	}
	static void m2() throws IOException{
		System.out.println("enter char : ");
		int j = System.in.read();
		System.out.println("U entered : "+(char)j);
	}

}

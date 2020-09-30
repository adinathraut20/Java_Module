package sep28;

import java.io.IOException;

public class CheckedExeDemo2 {

	public static void main(String[] args)throws IOException {
		System.out.println("Enter any char");
		int j = System.in.read(); 
		System.out.println("u entered "+(char)j);
	}

}

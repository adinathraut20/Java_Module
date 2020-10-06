package sep28;

import java.io.IOException;

public class Exception extends Throwable{

	public Exception(String string) {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i = Integer.parseInt("ab");
		try {
			int j = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(i);

	}

}

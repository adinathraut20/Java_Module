package sep28;

import java.io.IOException;

public class CheckedExceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int j;
			try {
				j = System.in.read();
				System.out.println("U enter "+(char)j);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

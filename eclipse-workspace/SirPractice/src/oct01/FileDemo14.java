package oct01;

import java.io.*;

public class FileDemo14 {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter any text");
		String str = br.readLine();
		
		System.out.println(str); 
	}

}

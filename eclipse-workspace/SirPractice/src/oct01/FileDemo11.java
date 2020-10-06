package oct01;

import java.io.*;

public class FileDemo11 {

	public static void main(String[] args)throws IOException {
		FileReader f = 
				new FileReader("E:\\cdac20\\dir\\my.txt");
		int ch = -1;
		while((ch = f.read()) != -1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println("success");
	}

}

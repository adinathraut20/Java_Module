package oct01;

import java.io.*;

public class FileDemo5 {

	public static void main(String[] args)throws IOException {
		FileInputStream f = 
				new FileInputStream("E:\\cdac20\\dir\\my.txt");
		int ch = -1;
		while((ch = f.read()) != -1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println("success");
	}

}

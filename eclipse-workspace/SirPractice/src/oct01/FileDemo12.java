package oct01;

import java.io.*;

public class FileDemo12 {

	public static void main(String[] args)throws IOException {
		FileWriter f = 
				new FileWriter("E:\\cdac20\\dir\\my.txt");
		String s = "this is first line to write.";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("success");
	}

}

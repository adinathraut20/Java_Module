package oct01;

import java.io.*;

public class FileDemo4 {

	public static void main(String[] args)throws IOException {
		FileOutputStream f = 
				new FileOutputStream("E:\\cdac20\\dir\\my.txt",true);
		String s = "this is first line to write.";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("success");
	}

}

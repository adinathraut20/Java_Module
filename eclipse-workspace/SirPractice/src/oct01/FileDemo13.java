package oct01;

import java.io.*;

public class FileDemo13 {

	public static void main(String[] args)throws IOException {
		FileReader f = 
				new FileReader("E:\\cdac20\\dir\\my.txt");
		BufferedReader b = new BufferedReader(f);
		String s = null;
		while((s=b.readLine())!=null) {
			System.out.println(s);
		}
		b.close();
		f.close();
		System.out.println("success");
	}

}

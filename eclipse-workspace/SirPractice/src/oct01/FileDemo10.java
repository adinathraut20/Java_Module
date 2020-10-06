package oct01;

import java.io.*;

public class FileDemo10 {

	public static void main(String[] args)throws IOException {
		FileWriter f = 
				new FileWriter("E:\\cdac20\\dir\\my.txt");
		BufferedWriter b = new BufferedWriter(f);
		String s = "this is first line to write.";
		b.write(s);
		s = "this is second line to write.";
		b.newLine();
		b.write(s);
		b.flush();
		b.close();
		f.close();
		System.out.println("success");
	}

}

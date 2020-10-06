package oct01;

import java.io.*;

public class FileDemo7 {

	public static void main(String[] args)throws IOException {
		FileInputStream f = 
				new FileInputStream("E:\\cdac20\\dir\\my.txt");
		DataInputStream d = 
				new DataInputStream(f);
		
		int i = d.readInt();
		String s = d.readUTF();
		double dd = d.readDouble();
		
		System.out.println(i+" "+s+" "+dd);
		
		d.close();
		f.close();
		System.out.println("success");
	}

}

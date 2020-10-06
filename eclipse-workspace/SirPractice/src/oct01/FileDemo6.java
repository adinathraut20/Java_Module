package oct01;

import java.io.*;

public class FileDemo6 {

	public static void main(String[] args)throws IOException {
		FileOutputStream f = 
				new FileOutputStream("E:\\cdac20\\dir\\my.txt");
		DataOutputStream d = 
				new DataOutputStream(f);
		
		d.writeInt(123);
		d.writeUTF("ram");
		d.writeDouble(8976.50);
		
		
		d.close();
		f.close();
		System.out.println("success");
	}

}

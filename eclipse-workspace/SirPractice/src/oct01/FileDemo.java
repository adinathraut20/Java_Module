package oct01;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("E:\\cdac20\\dir");
		
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		boolean b = f.mkdir();
		System.out.println(b);

	}

}

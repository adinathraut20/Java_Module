package oct01;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args)throws IOException {
		File f = new File("E:\\cdac20");
		
//		String files[] = f.list();
//		String files[] = f.list((ff,nm) -> nm.endsWith(".txt"));
		File files[] = f.listFiles(ff -> ff.isFile());
		
		for(File a : files) {
			System.out.println(a);
		}
		
		
		
		

	}

}

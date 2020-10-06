/* 63. Write a program to count how many times character ‘t’ occurs in a file. 
 */

package p61_67;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q63 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Adinath\\ACDAC\\java\\prac\\file1.txt");
		if(!f.exists()){
			f.createNewFile();
			
		}
		FileWriter f1 = new FileWriter("D:\\Adinath\\ACDAC\\java\\prac\\file1.txt");
		String str = "how are you t and t are u there t ttt";
		BufferedWriter b1 = new BufferedWriter(f1);
		f1.write(str);
		b1.flush();
		b1.close();
		FileReader r1 = new FileReader("D:\\Adinath\\ACDAC\\java\\prac\\file1.txt");
		int ch ;
		int count = 0;
		while((ch = r1.read()) != -1) {
			if((char)ch == 't') {
				count++;
			}
		}
		System.out.println("Count : "+ count);
		f1.close();
	
		
	}

}

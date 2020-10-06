/* 67. Write a program to read data from shopping.dat file creted in above 
 * problem and find total money spent on all shopping items. . 
 * (Use ObjectInputStream to read Item class object).
 */

package p61_67;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class q67 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\Adinath\\ACDAC\\java\\prac\\file1.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		
		ArrayList<Item> a = new ArrayList<>();
		Object obj = null;
	
boolean flag = true;
		while(flag) {
			if(f.available() != 0) {
				obj = (Item)o.readObject();
				a.add((Item) obj);
			}else {
				flag = false;
			}
	    }
		for(Item x : a) {
			System.out.println(x);
		}

		o.close();
}
}

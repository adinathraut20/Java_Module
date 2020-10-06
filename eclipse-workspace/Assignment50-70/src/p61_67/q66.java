/* 66. Write a program to store your shopping details in a
 *  binary file(shopping.dat) with information itemName, price, quantity. 
 *  (Use ObjectOutputStream to store Item class object ).
 */

package p61_67;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String itemName;
	int price;
	int quantity;
	
	public Item(String itemName, int price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "{\nitemName : "+itemName+",\n"+" price : "+price+",\n"+" quantity : "+quantity+"\n}";
	}
}

public class q66 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream f = new FileOutputStream("D:\\Adinath\\ACDAC\\java\\prac\\file1.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("itemName : ");
			String itemName = sc.next();
			System.out.print("price : ");
			int price = sc.nextInt();
			System.out.print("quantity : ");
			int quantity = sc.nextInt();
			Item j = new Item(itemName,price,quantity);
			o.writeObject(j);
		}
		o.close();
		sc.close();
	}

}
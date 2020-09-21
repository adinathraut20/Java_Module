// For Each loop the print Array of String 

import java.util.*;

class foreach2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		String arr[] = { "Aditya", "Aditi", "Akanksha", "Abhishek","Abhijeet","Aishwarya"};
		
		for(String i : arr){
			System.out.println(i);    //
		}
	}
}
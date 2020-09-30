package sep30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class CollectionDemo8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("shiv");
		al.add("rama");
		al.add("ramesh");
		al.add("shiva");
		al.add("ram");
		al.add("keshav");
		al.add("mohan");
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
	}

}

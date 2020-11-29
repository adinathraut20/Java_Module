package com.cdac.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;

public class ListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>(); //aList is not null
		ArrayList<String> bList; //null
		
		aList.add("One");
		aList.add("Two");
		aList.add("Three");
		aList.add("One");
		aList.add("Two");
		aList.add("Three");
		aList.add(null);
		System.out.println("Size of the Array list : "+aList.size());
		System.out.println(aList);
		
		String secondElt = aList.get(2);
		System.out.println(secondElt);
		
		System.out.println("Reading array list using for loop");
		for(int i=0;i<aList.size();i++)
			System.out.println(i+" -- "+aList.get(i));
		
		//length - used only in array
		//size() - used in collections
		
		System.out.println("Reading using Iterator");
/*		Iterator iterator = aList.iterator();
		while( iterator.hasNext() ){
			String s = (String) iterator.next();
			System.out.println(s);
		}*/
		
		//Should remember this approach
		Iterator<String> iterator = aList.iterator();
		while( iterator.hasNext() ){
			String s = iterator.next();
			System.out.println(s);
		}
		System.out.println("Is empty "+aList.isEmpty());
		System.out.println("Does it contins TEN "+aList.contains("TEN"));
		System.out.println("Does it contins Two "+aList.contains("Two"));
	}

}

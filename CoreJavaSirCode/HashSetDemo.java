package com.cdac.java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<>();
		boolean status = hSet.add("One");
		System.out.println("Insert one at the first time : "+status);
		hSet.add("Two");
		hSet.add("Three");
		hSet.add("Four");
		hSet.add("Five");
		hSet.add(null);
		status = hSet.add("One");
		System.out.println("Insert one as duplicate value : "+status);
		System.out.println(hSet);
		//read all - one order
		// read again - same order
		//same values same insertion order
		//read it from different machine - we can't predict the order of output
		
		hSet.remove("One");
		System.out.println("Reading using iterator");
		Iterator<String> iterator = hSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		hSet.size();
		hSet.isEmpty();
		hSet.contains("Six");
		hSet.clear();
		System.out.println(hSet);
	}
}
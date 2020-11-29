package com.cdac.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<Integer> set = new TreeSet<>();
		ReverseOrder comparator = new ReverseOrder();
		TreeSet<Integer> set  = new TreeSet<>(comparator);
		set.add(10);
		set.add(25); // 25 is duplicate
		set.add(7);
		set.add(15);
		set.add(15);
		set.add(15);
		System.out.println(set);
		//for integers natural sorting order is  - ascending order
		
		Student s1 = new Student(101,"Rahul", 100, 150, 175); // 425
		Student s2 = new Student(102,"Rohan", 100, 200, 150); // 450
		Student s3 = new Student(103,"Suresh", 130, 120, 140); // 390
		
		MarkComparator markComparator = new MarkComparator();
		TreeSet<Student> stdSet = new TreeSet<>(markComparator);
		stdSet.add(s3); // 
		stdSet.add(s1);
		stdSet.add(s2);
		
		System.out.println(stdSet);
	}
}
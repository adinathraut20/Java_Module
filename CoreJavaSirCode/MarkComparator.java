package com.cdac.java;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int s1Total = o1.m1 + o1.m2 + o1.m3;
		int s2Total = o2.m1 + o2.m2 + o2.m3;
		
		if(s1Total > s2Total)
			return -1;
		if(s1Total < s2Total)
			return 1;
		return 0;
	}

}
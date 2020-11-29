package com.cdac.java;

import java.util.Comparator;

class ReverseOrder implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// return 0 - if o1 == o2
		// return +ve - if o1 > o2
		// return -ve  - if o1 < o2
		//reverse order 5,4,3,2,1

		/*//ascending order
		if(o1 > o2)
			return 1;
		if(o1 < o2)
			return -1;*/
		
		//reverse order
		if(o1 > o2)
			return -1;
		if(o1 < o2)
			return 1;
		return 0;
	}
}

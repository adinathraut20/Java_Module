package sep29;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo14 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(1);
		a.add(2);
		a.add(2);
		System.out.println(sum(a));
		
	}
	static int sum(ArrayList<Integer> al) {
		int s = 0;
		for(Integer a : al) {
			s += a;
		}
		return s;
	}

}

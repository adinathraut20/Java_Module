package sep29;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo13 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(3);
		a.add("ab");
		a.add(2);
		a.add(2);
		System.out.println(sum(a));
		
	}
	static int sum(ArrayList al) {
		int s = 0;
		for(Object a : al) {
			if(a instanceof Integer) {
				Integer i = (Integer)a;
				s += i;
			}
		}
		return s;
	}

}

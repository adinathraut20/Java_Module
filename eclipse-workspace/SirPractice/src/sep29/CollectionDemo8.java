package sep29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo8 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(888.45);
		Object obj = a.get(1);
		System.out.println(obj);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}


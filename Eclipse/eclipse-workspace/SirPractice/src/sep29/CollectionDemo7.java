package sep29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo7 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
//		a.add(null);
		
		ListIterator lit = a.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("====================");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
	}

}

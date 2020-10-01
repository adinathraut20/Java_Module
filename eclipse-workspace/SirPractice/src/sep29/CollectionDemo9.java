package sep29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo9 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
//		a.add(null);
		
		ListIterator lit = a.listIterator();
		while(lit.hasNext()) {
			Object obj = lit.next();
			System.out.println(obj);
//			lit.remove();
//			lit.add("777");
			lit.set("777");
		}
		System.out.println(a);
		
	}

}


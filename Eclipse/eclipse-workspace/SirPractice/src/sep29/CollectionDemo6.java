package sep29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo6 {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
		a.add(null);
		
		// traversing using Iterator
		
		Iterator it = a.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
//			it.remove();
//			a.remove("ram");
		}
		
		System.out.println(a);
		
	}

}

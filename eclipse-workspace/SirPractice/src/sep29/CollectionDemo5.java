package sep29;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
		
		// traversing using for each
		
		for(Object obj : a) {
			System.out.println(obj);
//			a.remove("ram");
		}
	}

}

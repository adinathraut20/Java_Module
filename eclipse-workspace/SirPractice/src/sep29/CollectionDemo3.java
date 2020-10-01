package sep29;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
		
		Collection a1 = new ArrayList();
		a1.add(123);
		a1.add("ram");
		a1.add(89.50);
		
		System.out.println(a);
		System.out.println(a1);
		a.removeAll(a1);
		System.out.println(a);
		System.out.println(a1);
		a.addAll(a1);
	}

}

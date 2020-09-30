package sep29;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(123);
		a.add("ram");
		a.add(8976.50);
		System.out.println(a);
		a.remove("ram");
		System.out.println(a);
	}

}

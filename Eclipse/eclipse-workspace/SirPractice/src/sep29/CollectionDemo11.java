package sep29;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDemo11 {

	public static void main(String[] args) {
		Set a = new LinkedHashSet();
 		
		a.add(123);
		a.add("ram");
		a.add("ram");
		a.add(8976.50);

		System.out.println(a);
		
	}

}


package sep30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();
		
		m.put("rno", 123);
		m.put("name", "ram");
		m.put("fee", 9090.50);
		m.put(null, 9090.50);
		
		Set<String> keys = m.keySet();
		
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}

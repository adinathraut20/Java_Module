package sep30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo4 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();
		
		m.put("rno", 123);
		m.put("name", "ram");
		m.put("fee", 9090.50);
		m.put(null, 9090.50);
		
		Set<Entry<String, Object>> s = m.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
			
		}
		
		for(Entry<String,Object> a : s) {
			System.out.println(a);
		}
	}

}

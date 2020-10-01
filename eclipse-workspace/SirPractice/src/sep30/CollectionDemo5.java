package sep30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo5 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(13);
		al.add(1);
		al.add(42);
		al.add(33);
		al.add(21);
		al.add(1);
		al.add(10);
		
		Stream<Integer> strm = al.stream();
		strm = strm.distinct();
//		strm.forEach(ele -> System.out.println(ele)); 
		
		System.out.println(al); 
		
		
		List<Integer> al1 = strm.collect(Collectors.toList());
		System.out.println(al1); 

	}

}

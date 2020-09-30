package sep30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionDemo4 {

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
		// perform operation on every element of stream
		strm = strm.map( n -> n + 100 );
		strm.forEach( p -> System.out.println(p));
		
		
	}

}

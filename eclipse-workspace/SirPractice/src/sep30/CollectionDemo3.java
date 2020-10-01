package sep30;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionDemo3 {

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
		// show the content of the stream
		strm.forEach(ele -> System.out.println(ele)); 
		

	}

}

package p1;

import static p2.Foo.num;
import static p2.Foo.m1;
import static java.lang.System.out;

public class StaticImportDemo2 {

	public static void main(String[] args) {
		out.println(num);
		m1();
	}

}

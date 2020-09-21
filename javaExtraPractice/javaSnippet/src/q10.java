// o/p : Writing book

import java.util.*;

class Writer{

	public static void write(){
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write(){
		System.out.println("Writing book");
	}
}

public class q10 extends Author{
		public static void write(){
			System.out.println("Writing code");
		}

		public static void main(String[]args){
		
			Author a = new q10();
			a.write();
		}
	}

package sep26;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String uname = sc.next();
		System.out.println("Enter password");
		String upass = sc.next();
		if(uname.equalsIgnoreCase("ram") && upass.equals("abc")) {
			System.out.println("welcome");
		}else {
			System.out.println("try again");
		}
	}

}

/* 59. Create a class Voter(voterId, name, age) with parameterized constructor.  
The parameterized constructor should throw a checked exception if age is less than 18.
The message of exception is “invalid age for voter ” 
*/

package p51_60;

import java.util.Scanner;

class Voter {
	private int voterId;
	private String name;
	private int age;
	
	Voter(int voterId, String name, int age) throws Exception{
		if(age < 18) {
			throw new Exception("invalid age for voter");
		}
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "voterId : " + voterId + ", \nname : " + name + ", \nage : " + age;
	}
}

public class q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Voter Details :");
			System.out.print("Voter Id : ");
			int id = sc.nextInt();
			System.out.print("Name : ");
			String name = sc.next();
			System.out.print("Age : ");
			int age = sc.nextInt();
			try {
			Voter v1 = new Voter(id,name,age);
			System.out.println(v1.toString());
			}
			catch(Exception e) {
				//System.out.println("invalid age for voter");
				System.out.println(e);
			}
			finally {
				sc.close();
			}
			
	}

}

/* 60. Create Interface StudentFee and declare following method. 
 *  getFee() throws InvalidFeeException. This method ask fees from user and 
 *  throws exception if user enters invalid or negative fees Create class Student
 *   with members (name, fees) and implement the StudentFee Interface.
 */

package p51_60;

import java.util.Scanner;

interface StudentFee{
	double getFee() throws Exception;
}


class Student implements StudentFee{
	private String name;
	private double fees;
	Student(String name){
		this.name = name;
		this.fees = 0;
	}
	public double getFee() throws Exception {
		System.out.print("Enter the Fee : ");
		Scanner sc = new Scanner(System.in);
		double fee = sc.nextDouble();
		sc.close();
		if(fee < 0) {
			throw new Exception("Invalid Fees!!!");
		}
		fees = fee;
		return fees;
		}

}

public class q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		try {
		Student s1 = new Student("Adinath");
		System.out.println(s1.getFee());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

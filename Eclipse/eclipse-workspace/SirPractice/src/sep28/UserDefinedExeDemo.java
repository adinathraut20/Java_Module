package sep28;

import java.util.Scanner;

class SalaryException extends Exception{
	SalaryException(){
		super("What !!!! this is not any salary??????");
	}
}
public class UserDefinedExeDemo {
	
	static void salary(float sal) throws SalaryException {
		if(sal>10000) {
			System.out.println("sal = "+sal);
		}else {
			throw new SalaryException();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		float s = sc.nextFloat();
		try {
			salary(s);
		}catch (SalaryException e) {
			System.out.println(e);
		}

	}

}

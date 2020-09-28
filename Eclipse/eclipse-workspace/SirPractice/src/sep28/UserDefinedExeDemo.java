package sep28;

import java.util.Scanner;

class SalaryException extends Exception{
	SalaryException(){
		super();
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
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Salary :");
			float s = sc.nextFloat();
			try {
				salary(s);
				
			}catch(SalaryException e) {
				System.out.println(e);
			}
			sc.close();
	}

}

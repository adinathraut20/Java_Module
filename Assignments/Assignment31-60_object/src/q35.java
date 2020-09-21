/* 35. Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.
*/


import java.util.Scanner;

class MathOperation{
	
	static int add(int a, int b){
		return a+b;
	}
	static int substract(int a, int b){
		return a-b;
	}
	static int multiply(int a, int b){
		return a*b;
	}
	static int power(int a,int b){
		int pow = 1;
		for(int i=1;i<=b;i++){
			pow*=a;
		}
		return pow;
	}
}

class Demo{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no : " );
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition : " + MathOperation.add(a,b));
		System.out.println("\nSubstraction : " + MathOperation.substract(a,b));
		System.out.println("\nMultiplication : " + MathOperation.multiply(a,b));
		System.out.println("\nPower of "+a+" raise to "+b+ " : " + MathOperation.power(a,b));
	}
}
		

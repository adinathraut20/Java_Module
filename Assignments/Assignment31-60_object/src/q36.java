/* 36. Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.  two integers 
b.  three floats 
c.  all elements of array 
d. one double and one integer
*/


import java.util.Scanner;

class MathOperation{

	static int multiply(int a,int b){
		return a*b;
	}
	
	static float multiply(float a,float b,float c){
		return a*b*c;
	}
	
	static int multiply(int []arr){

		int mul = arr[0];
		for(int i=1;i<arr.length;i++){
			mul*=arr[i];
		}
		return mul;
	}
	
	static double multiply(double a,int b){
		
		return (double)(a*b);
	}
} 



class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("a) Enter two Interger value :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplication : " + MathOperation.multiply(a,b));
		System.out.println("\nb) Enter 3 Float value : ");
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float e = sc.nextFloat();
		System.out.println("Multiplication : " + MathOperation.multiply(c,d,e));  // or MathOperation.multiply(2.1f,3.5f,4.5f)
		System.out.println("\nc) Enter An Array length : ");
		a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Multilplication : " + MathOperation.multiply(arr));
		System.out.println("\nd) Enter 1 double & 1 interger no : ");
		double g = sc.nextDouble();
		a = sc.nextInt();
		System.out.println("Multiplication : " + MathOperation.multiply(g,a));
		}
}

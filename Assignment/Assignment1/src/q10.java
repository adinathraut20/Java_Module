/* 10. Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/


import java.util.Scanner;

class TemperatureConverter{
	public static void main(String []args){
		System.out.println("Enter Temperature in Fahrenheit : ");
		Scanner sc = new Scanner(System.in);
		float temp = sc.nextFloat();
		float Ctemp = (float) 5*(temp - 32 )/9;
		System.out.println("Temperature in Celsius : "+Ctemp+" C");
		}
}

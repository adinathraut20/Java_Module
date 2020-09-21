/* 6. Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
*/

import java.util.Scanner;

class circleArea {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of circle : ");
		double radii = sc.nextDouble();
		double area = (22/7)*radii*radii;
		double circumference = 2*(22/7)*radii;
		System.out.println("Circle Area : "+area+"\nCircumference : "+circumference);
	}
}

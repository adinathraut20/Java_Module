import java.util.Scanner;
abstract class Shape{
	float ar;
	abstract void area();
	void show(){
		System.out.println("Area = "+ar);
	}
}
class Rectangle extends Shape{
	void area(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len");	
		float len = sc.nextFloat();
		System.out.println("Enter br");
		float br = sc.nextFloat();
		ar = len * br;
	}	
}
class ShapeDemo{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		r.area();
		r.show();
	}
}

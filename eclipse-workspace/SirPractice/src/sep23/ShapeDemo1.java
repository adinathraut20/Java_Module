import java.util.Scanner;
interface Drawable{
	//float PI = 3.14F;
	public static final float PI = 3.14f;
	//void draw();
	public abstract void draw();
}
abstract class Shape{
	float ar;
	abstract void area();
	void show(){
		System.out.println("Area = "+ar);
	}
}
class Rectangle extends Shape implements Drawable{
	void area(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter len");	
		float len = sc.nextFloat();
		System.out.println("Enter br");
		float br = sc.nextFloat();
		ar = len * br;
	}
	public void draw(){
		System.out.println("drawing rect");
	}	
}
class ShapeDemo1{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		r.area();
		r.show();
		r.draw();
		System.out.println(Drawable.PI);
	//	Drawable.PI = 3.4F;
	}
}

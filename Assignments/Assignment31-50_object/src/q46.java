/* 46. Create a program to demonstrate the use of instanceof operator or secure reference down casting.
o/p :   
	1 Child class Y = 8
	2 Child class Z = 10
	p1 is Instance of Child 1
	p3 Instance of Child 2
	2 Child class Z = 10
*/


class Parent{
	public int x;
	
	Parent(){
		x = 1;
	}
	Parent(int x){
		this.x = x;
	}
	
	void show(){
		System.out.println("Parent class X = "+x);	
	}
}

class Child1 extends Parent{
	public int y;
	Child1(){
		y = 2;
	}
	Child1(int y){
		this.y = y;
	}
	
	void show(){
		System.out.println("1 Child class Y = "+y);
	}
}

class Child2 extends Parent{
	public int z;
	Child2(){
		z = 2;
	}
	Child2(int z){
		this.z = z;
	}
	
	void show(){
		System.out.println("2 Child class Z = "+z);
	}
}
class Demo{
	public static void main(String []args){

		Parent p1 = new Child1(8);  	// upcasting
		p1.show();   			// 1 Child class Y = 8

		Parent p2 = new Child2(10);
		p2.show();  			// 2 Child class Z = 10

		if(p1 instanceof Child1){
			System.out.println("p1 is Instance of Child 1");  //  p1 is Instance of Child 1
		}
		else if(p1 instanceof Child2){
			System.out.println("p1 Instance of Child 2");
		}
		else if(p1 instanceof Parent){
			System.out.println("p1 Instance of Parent");
		}
		
		Child2 p3 = (Child2) p2;  //downcating
		
		if(p3 instanceof Child2){
			 
			System.out.println("p3 Instance of Child 2");   // p3 Instance of Child 2
		}
		p3.show();    // 2 Child class Z = 10
	}
}

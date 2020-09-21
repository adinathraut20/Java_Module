// Error in program


import java.util.*;

class Grandparent{
	public void Print(){
		System.out.println("GrandParent's Print()");
	}
}

class Parent extends Grandparent{
	public void Print(){
		System.out.println("Parent's Print()");
	}
}

class Child extends Parent{
	public void Print(){
		super.super.Print();
		System.out.println("Child's Print()");
	}
}

public class q3{
	public static void main(String[] args){
	 Child c = new Child();
	c.Print();
	}
}

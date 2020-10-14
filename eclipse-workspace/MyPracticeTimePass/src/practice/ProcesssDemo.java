package practice;


import java.util.Scanner;

abstract class Processor  {
	 double data;
	 void showData() {
		 System.out.println(data);
	 }
	 abstract void process(double d);
} 

class Factorial extends Processor{
	void process(double d){
	double fact = 1;
	for(int i=1;i<=d;i++) {
		fact *= i;
	}
	data = fact;
}
}

class Circle extends Processor{
	void process(double d) {
		double area = 3.14*d*d;
		data = area;
	}
}

class ProcessDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			double data = sc.nextDouble();
			switch(i) {
			case 1 :
				Processor p1 = new Factorial();
				p1.process(data);
				p1.showData();
				break;
		
			case 2 : 
				Processor p2 = new Circle();
				p2.process(data);
				p2.showData();
				break;
			}
			sc.close();
			
	}

}

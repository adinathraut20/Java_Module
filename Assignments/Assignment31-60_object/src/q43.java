/* 43. Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 
*/


import java.util.Scanner;

class OneBHK{
		private double roomArea;
		private double hallArea;
		private double price;
		
		OneBHK(){
			roomArea = 1000;
			hallArea = 3000;
			price = 1_00_000;
		}
		
		OneBHK(double roomArea,double hallArea,double price){

			this.roomArea = roomArea;
			this.hallArea = hallArea;
			this.price = price;
		}

		double getRoomArea(){
			return roomArea;
		}
		double getHallArea(){
			return hallArea;
		}

		double getPrice(){
			return price;
		}

		void show(){
			System.out.println("1 BHK : \nRoom Area : "+ roomArea + "\nHall Area : " + hallArea + "\nPrice : " + price);
		}
}

class TwoBHK extends OneBHK{
		private double room2Area;

		TwoBHK(){
			super();
			room2Area = 1500;
			}

		TwoBHK(double room2Area){
			super();
			this.room2Area = room2Area;
		}

		TwoBHK(double room1Area,double room2Area,double hallArea,double price){
			super(room1Area,hallArea,price);
			this.room2Area = room2Area;
		}

		void show(){
			System.out.println("\n2 BHK : \nRoom Area : "+ this.getRoomArea()+"\nRoom 2 Area : "+ room2Area + "\nHall Area : " + this.getHallArea() + "\nPrice : " + this.getPrice()+"\n");
		}
}

class Demo{
		public static void main(String []args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 BHK Detail : ");
			System.out.println("\nEnter Room 1 Area : ");
			double room1 = sc.nextDouble();
			System.out.println("Enter Room 2 Area : ");
			double room2 = sc.nextDouble();
			System.out.println("Enter Hall Room Area : ");
			double hallroom = sc.nextDouble();
			System.out.println("Enter Price : ");
			double price = sc.nextDouble();
			TwoBHK b1 = new TwoBHK(room1,room2,hallroom, price);
				
			System.out.println("Enter Room 2 Area : ");
			room2 = sc.nextDouble();
	 		TwoBHK b2 = new TwoBHK(room2);
			
			TwoBHK b3 = new TwoBHK();
			
			b1.show();
			b2.show();
			b3.show();
			
			price = b1.getPrice() + b2.getPrice() + b3.getPrice();
			System.out.println("Total Amount of Flats (Rs): "+price);
	}
} 

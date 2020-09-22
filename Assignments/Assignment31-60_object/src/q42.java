/* 42. Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/ 


import java.lang.Math;
import java.util.Scanner;

class Tile{
	private int elength;
	Tile(){
		elength = 0;
	}
	Tile(int elength){
		this.elength = elength;
	}
	int getLength(){
		return elength;
	}
}

class Floor{
	private int length;
	private int width;
	
	Floor(){
		length = width = 0;
	}
	Floor(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	int  totalTiles(Tile t){
		int no = Math.round((length*width)/(t.getLength()*t.getLength()));
		return no;
	}
	public static void main(String []args){
		System.out.print("Enter Square Tiles Edges length : ");
		Scanner sc = new Scanner(System.in);
		int tileL = sc.nextInt();
		Tile t = new Tile(tileL);
		System.out.print("\nEnter floor Length : ");
		int length = sc.nextInt();
		System.out.print("\nEnter floor Width : ");
		int width = sc.nextInt();
		Floor f = new Floor(length,width);
		System.out.println("\nTotal no of Tiles required : " + f.totalTiles(t));
	}
}

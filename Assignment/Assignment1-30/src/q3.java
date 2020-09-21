/* 3. Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]

*/

class Expression{
	public static void main(String []args){
		int x = 4;
		int y = (x*x) + (3*x) - 7;
		System.out.println("A) Value of Y = "+y);
		y = x++ + ++x;
		System.out.println("B) Value of X = "+x+"\n   Value of Y = "+y);
		int z = x++ - --y - --x + x++;
		System.out.println("C) Value of X = "+x+"\n   Value of Y = "+y+"\n   Value of Z = "+z);
		boolean	x1 = true;
		boolean y1 = false;
		boolean z1 = x1 && y1 || !(x1 || y1) ; 
		System.out.println("D) Value of Z = "+z1);
	}
}

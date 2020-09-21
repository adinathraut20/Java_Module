// Write a program to find Speical no  

/* Example: 145 1! =1 
4!=1*2*3*4 = 24   5!=1*2*3*4*5 = 120 
sum of the factorials is (1+24+120=145) 
*/
 
import java.util.Scanner; 

 
public class for4 { 
    
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	int n = sc.nextInt(); 

	if (isSpecialNumber(n)) { 
	    System.out.printf("%d is a special number.\n", n); 
	} else { 
	    System.out.printf("%d is not a special number.\n", n); 
	} 
    } 
 
    public static boolean isSpecialNumber(int n) { 
	int i = n, factorialSum = 0; 
	while (i > 0) { 
	    int digit = i % 10; 
	    i /= 10; 
	    factorialSum += factorial(digit); 
	} 
	return factorialSum == n ? true : false; 
    } 
 
    public static int factorial(int n) { 
	int factorial = 1; 
	int i = n < 0 ? -n : n; 
	for(int j=1;j<=n;j++){
			factorial*=j;
		}
	return n < 0 ? -factorial : factorial; 
    } 
} 

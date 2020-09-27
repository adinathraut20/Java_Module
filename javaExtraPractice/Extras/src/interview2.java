
import java.util.Scanner;

class SumSeries{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n;
		for(int i=2;i<=n;i=2*i){
			sum+=n/i;
		}
		System.out.println("Sum : "+sum);
	}
}

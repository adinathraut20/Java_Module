/* Reverse No.
i/p  :  123  o/p  :  321
i/p  :  -123 o/p  :  -321


*/

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        
        double rev = 0;
        int r = 0;
        boolean flag = false;
        
        while(x!=0){
            r = x%10;
            rev = rev*10 + r;
            x = x/10;
            
        }
            if(Integer.MIN_VALUE > rev || rev > Integer.MAX_VALUE){
                return 0;
            }
            else{
                return (int)rev;
            }
    }
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(s.reverse(n));
		
	}

}


/* Number Palindrome
i/p : 121 o/p : true
i/p : -121  o/p : false
*/

import java.util.Scanner;

class Solution {
	public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int i = x;
        int rev = 0;
        
        while(i!=0){
            int r = i%10;
            rev = rev*10 + r;
            i = i/10;
        } 
        System.out.println(rev+" "+x);
        if(rev == x){
            return true;
        }
        return false;
        
    }
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(s.isPalindrome(n));
		
	}

}


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str = sc.next();
        int countC = 0;
        int countO = 0;
       // System.out.print(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                countO++;
                continue;
            }
            if(str.charAt(i) == ')'){
                countC++;
            }
        }
        if(countO-countC > 0){
            System.out.print(countO-countC);
        }
        else if(countO-countC < 0){
            System.out.print(countC-countO);
        }
        else {
            System.out.print(0);
        }
    }
}
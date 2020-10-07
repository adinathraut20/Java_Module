import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        int c = A.compareTo(B);
        String str1 = A.substring(0,1);
        str1 = str1.toUpperCase() + A.substring(1);
        String str2 = B.substring(0,1);
        str2 = str2.toUpperCase() + B.substring(1);
       
        if(c < 0 ){
            System.out.println("No");
            System.out.println(str1 + " " + str2);
        }
        else if(c > 0 ){
            System.out.println("Yes");
            System.out.println(str1 + " " + str2);
        }else{
            System.out.println("No");
            System.out.println(str1 + " " + str2);
        }
    }
}


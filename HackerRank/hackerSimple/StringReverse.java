import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
        char arr [] = A.toCharArray();
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n;i++){
                if(arr[i] != arr[n-i-1]){
                    flag = false;
                }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



/*

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder str = new StringBuilder(A);
        StringBuilder revStr = str.reverse();
        if(A.equals(revStr.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

*/
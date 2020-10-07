// java String Token

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if(s.equals("")){
            System.out.println(0);
        }
        else{
        String str[] = s.split("[ !,?._'@]+");
        System.out.println(str.length);
        for(int i=0; i<str.length;i++){
            System.out.println(str[i]);
        }
        }
    }
}


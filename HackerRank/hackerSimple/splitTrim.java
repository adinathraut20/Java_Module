import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length()>0 && s.trim().length()<=400000){
        String []st = s.trim().split("[\\s@!,.'?_]+");
        System.out.println(st.length);
        for(int i=0;i<st.length;i++){
        System.out.println(st[i]);
        }
        }
        else{
            System.out.println(0);
        }
        scan.close();
    }
}



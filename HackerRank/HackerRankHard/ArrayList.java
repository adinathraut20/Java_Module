//Array list

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-- > 0){
            arr.add(sc.nextInt());
        }
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();

            switch(str){
                    case "Insert" : 
                        arr.add(sc.nextInt(),sc.nextInt());
                        break;
                    case "Delete" : 
                        arr.remove(sc.nextInt());       
                        break;
        }
        
    }
        for(Integer q : arr){
                    System.out.print(q+" ");
                }
            }

}
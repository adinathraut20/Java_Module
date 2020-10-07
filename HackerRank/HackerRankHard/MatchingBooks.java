import java.io.*;
import java.util.*;
import java.util.Collection;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String snull = sc.nextLine();
        String arr [] = new String [n];
        String arr1 [] = new String [n];
        for(int i=0;i<n*2+1;i++){
            if(i == n){
                String st = sc.nextLine();
                continue;
            }
            if(i < n){
                String str = sc.nextLine();
                str = str.trim().toLowerCase();
                arr[i] = str;
            }
            else {
                String str1 = sc.nextLine();
                str1 = str1.trim().toLowerCase();
                arr1[i-n-1] = str1;
            }
            
        }
      /* for(String j : arr1)
                 {
                     System.out.println(j);
                 } 
        */
        for(int i=0;i<n;i++){
                 int count = 0; 
                 int index = 0;
                 boolean flag = false; 
                 HashSet<String> mp = new HashSet<String>();
                 String s1[] = arr1[i].split(" ");
                            
                 for(String j : s1)
                 {
                     mp.add(j);
                 } 
                 for(int k=0;k<n;k++){
                    String s[] = arr[k].split(" ");
                    for(String l : s){
                        if(mp.contains(l)){
                            count++;
                        }
                        else if(count > 3){
                            flag = true;
                            index = k;
                            break;
                        }
                        else{
                            count = 0;
                        }
                    }
                    if(flag){
                        break;
                    }
                 }
                 if(flag){
                     System.out.println(index+1);
                 }
                 else{
                     System.out.println(0);
                 }
        }
    }
}

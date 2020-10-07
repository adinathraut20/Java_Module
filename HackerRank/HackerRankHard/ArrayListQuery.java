import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> [] arr = new ArrayList[n];
        for(int i=0;i<n;i++){
            int y = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>(y);
            for(int j = 0;j < y;j++){
                int z = sc.nextInt();
                arr1.add(z);    
            }
            arr[i] = arr1;
        }
      /*  for(ArrayList i : arr){
            System.out.println(i);
            
        }*/
        int n1 = sc.nextInt();
        for(int i=0;i<n1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            try{
                System.out.println(arr[x-1].get(y-1));

            }catch(Exception e){
                System.out.println("ERROR!");
            }
         

        }
    }
}
import java.io.*;
import java.util.*;
import java.util.Set;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();   
        char [] arr = str.toCharArray();
        //if(arr[0] == 'r'){
         //   System.out.println(str);
       // }
        Arrays.sort(arr);
       
        Map <Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0 ; i<arr.length;i++){
            if(arr[i] == ' '){
                continue;
            }
            if(mp.containsKey(arr[i])){
                int y = mp.get(arr[i]);
                y = y + 1;
                mp.put(arr[i],y);
            }
            else{
                mp.put(arr[i],1);
                }
        }
        
        char prevCh = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                continue;
            }
            if(prevCh == arr[i] && i>0) {
                continue;
            }
            else {
            System.out.print(arr[i]+":");
            for(int j=0;j<mp.get(arr[i]);j++){
                System.out.print("*");         
            }
            prevCh = arr[i];
            if(i == arr.length - 1){
                break;
            }
            System.out.println("\n");
            }
        }
        sc.close();
        }
        catch(Exception e){
            //System.out.println(e);
        }
    }
}
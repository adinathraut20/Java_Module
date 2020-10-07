import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        try{
            int x = sc.nextInt();
             int y = sc.nextInt();
            int z = x/y;
            System.out.println(z);

        }catch(InputMismatchException a){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
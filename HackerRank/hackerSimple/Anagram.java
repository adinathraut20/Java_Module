import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int len1 = a.length();
        int len2 = b.length();
        if(len1 != len2){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int []arr1 = new int [26];
        int []brr1 = new int [26];
        for(int i=0;i<len1;i++){
            int a1 = a.charAt(i) - 97;
            int b1 = b.charAt(i) - 97;
            //System.out.println(a1+" "+b1+ " hi");
            arr1[a1] = arr1[a1] + 1;
            brr1[b1] = brr1[b1] + 1;
        }
        for(int i=0;i<26;i++){
           // System.out.println(arr1[i]+" "+brr1[i]);
            if(arr1[i] != brr1[i]){
                return false;
            }
        }
        return true;
    }

    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


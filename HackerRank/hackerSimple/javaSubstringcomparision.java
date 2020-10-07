// Java Substring Comparision


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
       // java.util.ArrayList<String> arr = new java.util.ArrayList<String> ();
        String arr[] = new String[s.length()-k+1];

        for(int i=0;i<=s.length()-k;i++){
            if(i == s.length() - k + 1){
                String str2 = s.substring(i,k+i);
                arr[i] = str2;
                continue;
            }
            String str1 = s.substring(i,k+i);
            arr[i] = str1;
        }
        java.util.Arrays.sort(arr);

        smallest = arr[0];
        largest = arr[arr.length - 1];      
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


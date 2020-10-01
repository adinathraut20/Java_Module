package ArrayQuestions;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubString {
	static int lengthOfLongestSubstring(String s) {
        
		if(s.length() == 0){
            return 0;
        }
        s = s.trim();
        
        if(s.length() == 0){
            return 1;
        }
       // int check = s.charAt(0);
       
        int max =1;        
        for(int i=0;i<s.length();i++){
            int count = 1;
            HashSet<Character> mp = new HashSet<Character>();
            mp.add(s.charAt(i));
            
            for(int j=i+1;j<s.length();j++){
                
                if(!mp.contains(s.charAt(j))){
                    mp.add(s.charAt(j));
                    count++;
                    if(max<count){
                        max = count;
                    }
                
                }else{
                    break;
                }
            }
         
        }
        return max;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(lengthOfLongestSubstring(str));
		sc.close();
	}

}

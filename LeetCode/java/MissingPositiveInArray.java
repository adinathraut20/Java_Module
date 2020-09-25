/*  Write a function to find first postive no missing in given array  
i/p  : [1,2,0]    o/p :  3
i/p  : [1,1]     o/p : 2
i/p  : [-1,1,3]  o/p : 2
i/p  : [-1,-1]   o/p : 1
i/p  : [1,1,2,2] o/p : 3

*/


import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int cArr =0;
        int mno = 1;
        boolean flag = false;
         boolean flag1 = false;
        int prev = 0;
    
        for(int i : nums){
             cArr++;
            if(cArr > 1){
                if(prev == i){
                    continue;
                }
            }
            count++;
            if(i<1){
                count--;
                continue;
            }
            else {
                
                flag = true;
                if(count != i){
                   mno = count; 
                   flag1 = true;
                   break;    
                }
                
            }
           prev = i; 
            
        }
        if(flag && cArr == nums.length){
            
            if(count == 1 && flag1){
                return count;
            }
            if(count == 1 && !flag1){
                return count+1;
            }
            if(count > 1 && flag1){
                return count;
            }
            return count+1;    
        }
        if(flag1){
            return count; 
        }
        return mno;
        
    }   
}

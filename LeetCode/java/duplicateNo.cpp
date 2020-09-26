/* Find the duplicate in array
i/p : [1,3,4,2,2]  o/p : 2
i/p : [1,1]        o/p : 1
*/


#include<set>
class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        set<int> arr;
        for(int i : nums){
            if(arr.find(i) == arr.end()){
                arr.insert(i);
            }
            else{
                return i;
            }
        }
         return 0;
        
    }
};

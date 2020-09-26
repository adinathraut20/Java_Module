/* Find Single Occurence of no in given Array
i/p :  [2,2,1]  o/p : 1

*/



class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> arr = new HashMap<Integer,Integer>();
        
        for(int i: nums){
            if(!arr.containsKey(i)){
                arr.put(i,1);
            }
            else{
                    int value = arr.get(i);
                    value++;
                    arr.put(i,value);
            }
        }
        for (Map.Entry mapElement : arr.entrySet()){
            if((int)mapElement.getValue() == 1){
                return (int)mapElement.getKey();
            }
        }
        return 0;
    }
}

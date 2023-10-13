import java.util.HashMap;
class Solution {
    //solution1 using hashmap
    public int majorityElement1(int[] nums) {
        //making count HashMap  {Key:Value} = {Num:Occurence}
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }//end of for
        int n = 0;
        int half = nums.length/2;
        for(Integer element:map.keySet()){
            if(map.get(element)>half){
                n =  element;
                break;
            }
        }//end of method1
        return n;
    }
  //to do it with Time Complexity:O(n) and Space Complexity:O(1), we need to use Boyer's voting algorithm
}
public int majorityElement2(int[] nums){
        int count = 1;
        int candidate = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }//end of method 2

}//end of class

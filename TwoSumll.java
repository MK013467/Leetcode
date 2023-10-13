//Using two pointer algorithm
//Time Limit Exceed for Brute force approach 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int l = 0;
        int h = nums.length-1;
        while(l<h){
            int sum = nums[l] + nums[h];
            if(sum==target){
                result[0]=l+1;
                result[1]=h+1;
                break;
            }
            else if(sum>target){
                h--;
            }
            else{
                l++;
            }
        }
        return result;
    }
}

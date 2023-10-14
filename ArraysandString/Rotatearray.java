class Solution {
   //Method 1: easiest
    public void rotate(int[] nums, int k) {
        //easiet solution
        int[] nums2 = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            nums2[(i+k)%nums.length]=nums[i];
        }
        for(int j=0; j<nums2.length; j++){
            nums[j]=nums2[j];
        }

    }
    //Method2:
}

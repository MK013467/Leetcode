class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int count=1;
        int j =0;
        for(int i=1; i<nums.length; i++){

            if(nums[i]==nums[j]){
                count++;
                k++;
            }
            else{
                count = 1;
                k++;
                j=i;
            }
            if(count>2){
                nums[i] = 10001; 
                //maximum value is 10000
                k--;
            }
        }

        Arrays.sort(nums);
        return k;
    }//end of method
}

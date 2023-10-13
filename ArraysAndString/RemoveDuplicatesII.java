import java.util.Arrays;

class solution {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int j = 0;
        int count=1;
        for(int i=1; i<nums.length; i++){

            if(nums[i]==nums[j]){
                count++;
                k++;
            }
            else{
                j = i;
                count = 1;
                k++;
            }
            if(count>2){
                nums[i] = 10001;
                System.out.println(Arrays.toString(nums));
                k--;
                //maximum value is 10000
            }
        }

        Arrays.sort(nums);
        return k;
    }//end of method
    public static void main(String[] args){
        int[] nums = {0,1,1,1,1,2,2,2,2,2,2,3,3};
        System.out.println((removeDuplicates(nums)));
    }
}

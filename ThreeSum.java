import java.util.*;
public class ThreeSum{
    public static ArrayList<ArrayList> threesum(int[] nums){
        Arrays.sort(nums);
        ArrayList<ArrayList> result = new ArrayList<>();
        for(int i=0; i<(nums.legnth-2); i++){
            int dif = 0-nums[i];
            for(int j= i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                   if(nums[j]+nums(k)==dif){
                    int[] l = {i,j,k};
                    result.add(Arrays.asList(l));
                   }//end of if
                }//end of k loop
            }//end of j loop
        }//end of i loop
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,-2,3,4,5};
        System.out.println(threesum(nums));
    }
}
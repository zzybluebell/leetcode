import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for (int index = 0; index < nums.length; index ++){
            int second = target - nums[index];
            for (int j = index + 1; j < nums.length; j++) {
                if (nums[j] == second){
                    out[0] = index;
                    out[1] = j;
                }
            }
        }
       
        return out;
    }
}
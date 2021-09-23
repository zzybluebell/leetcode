class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int maxCount = count;
        for (int cur : nums) {
            if (cur == 0) {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
                continue;
            }
            count ++;
        }
        if (maxCount < count) {
            return count;
        } else {
            return maxCount;
        }
        
        
    }
    
}



# Two Sum:
https://leetcode.com/problems/two-sum/submissions/


**Time Complexity**:O(n)


```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int[] arr = {0, 0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - nums[i];
            if(map.containsKey(b) && i != map.get(b)){
                arr[0] = i;
                arr[1] = map.get(b);
                return arr;
            }
        }
        return arr;
    }
}
```
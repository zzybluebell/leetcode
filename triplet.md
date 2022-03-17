# Triplet (高盛真题面试)


### Given an int array `nums` and a threshold `t`, find `how many count` that fulfill 
    1. nums[i] < nums[j] < nums[k]
    2. nums[i] + nums[j] + nums[k] <= t


```java


class Solution {

  public static int countTriplet(int[] nums, int t) {

    Arrays.sort(nums);
    int len = nums.length;
    int cutoffIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > t ) {
        cutoffIndex = i;
        break;
      }
    }

    if (cutoffIndex != 0) len = cutoffIndex;
    int count = 0;
    for(int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j ++) {
        //binary search
        int remain = t - nums[i] - nums[j];
        if (remain <= 0) return count;
        int index = binarySearch(nums, j + 1, len - 1, remain);
        if (index !=  -1) {
          count += (index - j);
        } else {
          return count;
        }
      }
    }
    return count;
  }

  public static int binarySearch(int[] nums, int left, int right, int x) {

    if (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == x)
                return mid;

            if (nums[mid] > x)
                return binarySearch(nums, left, mid - 1, x);
            else
              return binarySearch(nums, mid + 1, right, x);
    }
    return -1;
  }



  public static void main(String[] args) {

    int[] nums = {1, 2, 2，2， 2, 4,5, 6, 7, 8, 9, 10, 11};
    int t = 8;
    
    System.out.println(countTriplet(nums, t));
    
  }
}

```
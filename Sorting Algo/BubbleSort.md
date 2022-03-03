# bubble sort 

## Hint:
1. 再一次loop 中将每一个element 比较放在最右边
2. 逐渐缩减loop 的长短
   


```java

public void bubbleSort(int[] nums) {
    int len = nums.length;
    while (len > 0) {
        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i - 1]) {
                swap(nums, i, i - 1);
            }
        }
        len --;
    }
}

public void swap(int[] nums, int i , int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}


```
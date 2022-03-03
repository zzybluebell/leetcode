# Selection Sort 

#Hint:
1. 和bubble sort 类似
2. 标记当前最大，当tranverse 一遍到最后的val的时候 和 marked max 交换
3. 每次都要 `将len --` 缩短 traverse 距离

```java


public void selectSort(int[] nums) {

    int len = nums.length;
    
    while (len > 0) {
        int max = Integer.MIN_VALUE;
        int recordIdx = 0;
        for (int i = 0 ; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];// select the max, and final swap to right of array
                recordIdx = i;
            }
        }
    swap (nums, recordIdx, len - 1 );
        len --;
    }

}



public void swap(int[] nums, int i , int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}


```
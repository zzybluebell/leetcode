# Insertion sort 


### hint :

1. 两次loop
2. 将每一个新的val 和前面sorted array 比较
3. 如果小于， 依次交换到小于这个element， break
   

```java

public void insertSort(int[] nums) {

    for (int i = 0; i < nums.length; i ++) {
        for (int j = i; j > 0; j --) {
            if (nums[j] < nums[j -1]) {
                swap(nums, j , j -1);
            } else {
                break;
            }
        }
    }
}


public void swap(int[] nums, int i , int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
```
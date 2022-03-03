# Quick Sort 

```java

public void quickSort(int[] nums) {
    partition(nums, 0, nums.length);
}

//挖坑法
public void partition(int[] nums, int left, int right) {
    if (left > right) return;
    int pviot = nums[left];

    int i = left, j = right;

    while (i < j ) {
        while (i < j && nums[j] > pviot)
            j--;
        if (i< j) {
            nums[j] = nums[i];
            i++;
        }
        while (i < j && nums[i] < pviot)
            i++;
        if (i< j) {
            nums[i] = nums[j];
            j --;
        }
    }

    nums[i] = pviot;
    partition(nums, left, i - 1);
    partition(nums, i + 1, right);


}



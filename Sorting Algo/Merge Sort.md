# Merge Sort 

```java

public void mergeSort(int[] nums) {

    mergeSort(nums, 0, nums.length);
}

public void mergeSort(int[] nums, int left, int right) {

    if (left == right) return;
    if (left < right) {
        int mid = (left + right)/2
        mergeSort(nums, 0, mid);
        mergetSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
}

public void merge(int[] nums, int left, int mid, int right) {
    int leftSize = mid - left + 1; 
    int rightSize = right - mid;

    int[] leftArray = new int[leftSize];
    int[] rightArray = new int[rightSize];

    for (int i = left; i <= mid; i++) {
        leftArray[i - left] = nums[i];
    }
    for (int i = mid + 1 ; i <= right; i++) {
        leftArray[i - mid - 1] = nums[i];
    }

    int i = 0, j = 0, k = left;
    while (i < leftSize &&  j < rightSize){
        if (leftArray[i] < rightArray[j]) {
            nums[k] = leftArray[i];
            i++;
            k++;
        } else {
            nums[k] = rightArray[j];
            j++;
            k++;
        }
        
    }

    while (i < leftSize) {
        nums[k] = leftArray[i];
        k++;
        i++;
    }
    while (j < rightSize) {
        nums[k] = leftArray[j];
        k++;
        j++;
    }
}




```
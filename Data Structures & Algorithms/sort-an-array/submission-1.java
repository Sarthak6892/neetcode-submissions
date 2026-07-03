class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length - 1;
        quickSort(nums,low, high);
        return nums;
    }

    public void quickSort(int[] nums, int low, int high){
        // base condition
        if(low > high) return;
        int partisonIndex = partison(nums,low,high);
        quickSort(nums,low,partisonIndex - 1);
        quickSort(nums, partisonIndex + 1 , high);
    }

    public int partison(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j){
            while(nums[i] <= pivot && i < high) i++;
            while(nums[j] > pivot && j >= low) j--;
            if(i < j) swap(nums,i,j);
        }

        swap(nums,low,j);
        return j;
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
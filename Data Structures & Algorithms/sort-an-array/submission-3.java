class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length - 1;
        quickSort(nums,low,high);
        return nums;
    }
    public void quickSort(int[] nums, int low, int high){
        if(low >= high) return;
        int partisonIndex = partison(nums,low,high);
        quickSort(nums,low,partisonIndex - 1);
        quickSort(nums,partisonIndex + 1, high);
    }
    public int partison(int[] nums, int low, int high){
        int pivot = nums[low];
        int left = low, right = high;
        while(left < right){
            while(left <= high && nums[left] <= pivot) left++;
            while(right >= low && nums[right] > pivot ) right--;
            if(left < right) swap(nums,left,right);
        } 

        swap(nums,low,right);
        return right;
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
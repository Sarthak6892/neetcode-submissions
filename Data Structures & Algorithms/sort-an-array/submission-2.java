class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums,low,high);
        return nums;
    }
    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public int partison(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;
        while(i < j){ 
            while(nums[i] <= pivot && i < high){
                i++;
            }

            while(nums[j] > pivot && j >= low){
                j--;
            }

            if(i < j ) swap(nums,i,j);
        }

        swap(nums,low,j);
        return j;
    }

    public void quickSort(int[] nums, int low, int high){
        if(low >= high) return;
        int partisonIndex = partison(nums,low,high);
        quickSort(nums,low,partisonIndex - 1);
        quickSort(nums,partisonIndex + 1,high);
    }
}
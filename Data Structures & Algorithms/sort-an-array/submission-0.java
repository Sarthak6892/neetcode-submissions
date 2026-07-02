class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums,low,high);
        return nums;
    }

    public static void quickSort(int[] nums, int low, int high){
        if(low > high) return;
        int partisonIndex = partison(nums,low,high);
        quickSort(nums,low,partisonIndex -1);
        quickSort(nums,partisonIndex + 1, high);
    }

    public static int partison(int[] nums, int low, int high){
        int i = low;
        int j = high;
        int pivot = nums[low];

        while(i < j){
            while( nums[i] <= pivot && i < high) i++;
            while(nums[j] > pivot && j >= low) j--;
            if( i < j) swap(nums,i,j);
        }

        swap(nums,low,j);
        return j;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
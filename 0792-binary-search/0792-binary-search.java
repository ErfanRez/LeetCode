class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int low, int high){
        if(high >= low){
            int mid = (high + low) / 2;

            if (nums[mid] == target) return mid;
            else if(target > nums[mid]) return binarySearch(nums, target, mid + 1, high);
            else return binarySearch(nums, target, low, mid - 1);
        }

        return -1;
    }
}
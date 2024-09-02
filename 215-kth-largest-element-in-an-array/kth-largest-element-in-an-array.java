class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] arr = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < nums.length; i++){
            if(--k == 0) return arr[i];
        }

        return -1;
    }
}
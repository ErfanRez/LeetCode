class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1, len = 1;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] > nums[i]){
                len++;
            }else{
                max = Math.max(max, len);
                len = 1;
            }
        }

        max = Math.max(max, len);

        return max;        
    }
}
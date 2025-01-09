class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxInc = 1;
        int maxDec = 1;
        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxInc = Math.max(maxInc, len); 
                len = 1; 
            }
        }
        maxInc = Math.max(maxInc, len); 

        len = 1; 


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                len++;
            } else {
                maxDec = Math.max(maxDec, len);
                len = 1; 
            }
        }
        maxDec = Math.max(maxDec, len);


        return Math.max(maxInc, maxDec);
    }
}

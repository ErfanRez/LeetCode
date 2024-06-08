class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}

/* Clean Code:

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

 */
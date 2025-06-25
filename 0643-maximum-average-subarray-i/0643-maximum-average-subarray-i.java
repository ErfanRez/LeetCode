class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currAvg = 0;
        double currSum = 0;
        for(int i = 0; i < k; i++){
            currSum += nums[i];
        }

        int i = 0;
        int j = k - 1;
        double max = currAvg = currSum / k;
        while(j < nums.length - 1){
            currSum -= nums[i];
            i++;
            j++;
            currSum += nums[j];
            currAvg = currSum / k;
            max = Math.max(max, currAvg);
        }

        return max;
        
    }
}
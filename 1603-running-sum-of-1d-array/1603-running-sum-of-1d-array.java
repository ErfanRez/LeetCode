class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ps = new int[n];
        ps[0] = nums[0];

        for(int i = 1; i < n; i++){
            ps[i] = ps[i - 1] + nums[i];
        }

        return ps;
    }
}
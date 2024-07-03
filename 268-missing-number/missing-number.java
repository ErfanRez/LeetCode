class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;

        // for(int i = 0; i < n; i++){
        //     actualSum += nums[i];
        // } or:
        int actualSum = Arrays.stream(nums).sum();

        return Tsum - actualSum;
    }
}

//My way (Less space optimized):

// public int missingNumber(int[] nums) {
//         int[] v = new int[nums.length + 1];
//         Arrays.fill(v, -1);

//         for(int i = 0; i < nums.length; i++){
//             v[nums[i]] = nums[i];
//         }

//         for(int i = 0; i < v.length; i++){
//             if(v[i] == -1) return i;
//         }

//         return -1;
//     }
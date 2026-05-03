class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        int[] result = new int[nums.length];
        for(int k = nums.length - 1; k >= 0; k--){
            int j = nums[r];
            int i = nums[l];
            if(Math.abs(j) >= Math.abs(i)){
                result[k] = j*j;
                r--;
            }else{
                result[k] = i*i;
                l++;
            }
        }

        return result;
 }
}
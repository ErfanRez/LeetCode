class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int i = 0 , j = 1;
        int diff = 0;
        int cnt = 0;

        while(j < nums.length && i <= j){
            diff = nums[j] - nums[i];
            if(diff > 1){
                i++;
            }else if( diff < 1){
                j++;
            }else if(diff == 1){
               int temp = j - i + 1;
               cnt = Math.max(cnt, temp);
               j++;
            }
        }

        return cnt;
        
    }
}
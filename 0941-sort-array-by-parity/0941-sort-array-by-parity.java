class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result[head] = nums[i];
                head++;
            }else{
                result[tail] = nums[i];
                tail--;
            }
        }

        return result;
    }
}
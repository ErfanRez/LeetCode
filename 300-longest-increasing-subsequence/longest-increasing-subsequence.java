class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);

        for(int i = 1; i < len; i++){
            if(nums[i] > ans.get(ans.size() - 1))
                ans.add(nums[i]);
            
            else{
                int low = Collections.binarySearch(ans, nums[i]);

                if(low < 0)
                    low = -(low + 1);
                
                ans.set(low, nums[i]);
            }
        }

        return ans.size();
        
    }
}
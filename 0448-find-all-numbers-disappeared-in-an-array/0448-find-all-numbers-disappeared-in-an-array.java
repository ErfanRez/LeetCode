class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length + 1;
        int[] cnt = new int[n];

        for(int num : nums){
            cnt[num]++;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i < n; i++){
            if(cnt[i] == 0) result.add(i);
        }

        return result;
        
    }
}
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int t = 0;
            if(map.containsKey(num)) t = map.get(num);
            
            if(t + 1 > 2) return false;
            map.put(num, t + 1);
        }

        return true;
    }
}
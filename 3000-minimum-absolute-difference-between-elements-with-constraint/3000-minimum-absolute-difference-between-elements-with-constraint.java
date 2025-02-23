class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int result = Integer.MAX_VALUE;
    
        for(int i = 0; i < nums.size(); i++){
            if(i  - x >= 0){
                set.add(nums.get(i - x));
            }

            Integer lower = set.lower(nums.get(i) + 1);
            if(lower != null){
            result = Math.min(result, nums.get(i) - lower);
            }

            Integer higher = set.higher(nums.get(i) - 1);
            if(higher != null){
                result = Math.min(result, higher - nums.get(i));
            }
        }

        return result;

    }
}
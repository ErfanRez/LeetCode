import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(numToIndex.containsKey(target - nums[i])){
                return new int[] {i, numToIndex.get(target - nums[i])};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}

//Big-O = O(N)
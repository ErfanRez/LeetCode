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

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return new int[] {};
    }
}

*/

//Big-O = O(n^2)


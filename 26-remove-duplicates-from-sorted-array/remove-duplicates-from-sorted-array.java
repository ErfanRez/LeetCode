class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        Set<Integer> unique = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int element = nums[i];
            if(!unique.contains(element)){
                unique.add(element);
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}
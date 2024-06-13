class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

//My way: Big-O = O(n)

// int index = 0;
//         Set<Integer> unique = new HashSet<>();

//         for(int i = 0; i < nums.length; i++){
//             int element = nums[i];
//             if(!unique.contains(element)){
//                 unique.add(element);
//                 nums[index] = nums[i];
//                 index++;
//             }
//         }
        
//         return index;
//     }
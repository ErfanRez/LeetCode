class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int num : nums1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                resultList.add(num);
                map.put(num, map.get(num) - 1);

            }
        }

        int[] result = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }

        return result;
        
    }
}

//Another way:

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int l1 = nums1.length;
//         int l2 = nums2.length;
//         int i = 0, j = 0, k = 0;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         while( i < l1 && j < l2)
//         {
//             if(nums1[i] < nums2[j])
//             {
//                 i++;
//             }
//             else if(nums1[i] > nums2[j])
//             {
//                 j++;
//             }
//             else
//             {
//                 nums1[k++] = nums1[i++];
//                 j++;
//             }
//         }
//         return Arrays.copyOfRange(nums1,0,k);
//     }
// }
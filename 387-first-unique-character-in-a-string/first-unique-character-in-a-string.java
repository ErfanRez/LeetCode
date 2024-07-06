class Solution {
    public int firstUniqChar(String s) {

        for(int i = 0; i < s.length(); i++){
            
            if(s.lastIndexOf(s.charAt(i)) == i && s.indexOf(s.charAt(i)) == i) return i;
        }

        return -1;
        
    }
}

//Less optimized:

// public int firstUniqChar(String s) {
//         int n = s.length();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char ch: s.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         // for(int i=0; i<n; i++){
//         //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//         // }
//         for(int i=0; i<n; i++){
//             if(map.get(s.charAt(i)) == 1){
//                 return i;
//             }
//         }
//         return -1;
//     }
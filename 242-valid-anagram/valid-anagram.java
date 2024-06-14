class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        
        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}

// My way: Big-O = O(nlogn)

// public boolean isAnagram(String s, String t) {
//         char[] charS = s.toCharArray();
//         char[] charT = t.toCharArray();

//         Arrays.sort(charS);
//         Arrays.sort(charT);

//         return Arrays.equals(charS, charT);
//     }

///////////////////////////////////////////////////////////////////

// Using Hash Table: Big-O = O(n)

// public boolean isAnagram(String s, String t) {
//         Map<Character, Integer> count = new HashMap<>();
        
//         // Count the frequency of characters in string s
//         for (char x : s.toCharArray()) {
//             count.put(x, count.getOrDefault(x, 0) + 1);
//         }
        
//         // Decrement the frequency of characters in string t
//         for (char x : t.toCharArray()) {
//             count.put(x, count.getOrDefault(x, 0) - 1);
//         }
        
//         // Check if any character has non-zero frequency
//         for (int val : count.values()) {
//             if (val != 0) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
// }
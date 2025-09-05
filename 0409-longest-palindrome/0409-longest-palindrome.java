class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int result = 0;

        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for(int v : freqMap.values()){
            result += v % 2 == 0 ? v : v - 1;
        }

        return result < s.length() ? result + 1 : result;
    }
}
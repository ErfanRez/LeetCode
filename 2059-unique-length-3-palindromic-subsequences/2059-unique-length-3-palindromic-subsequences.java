class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] R = new int[26];
        Set<Integer> set = new HashSet<>();

        for(char c : s.toCharArray()){
            R[c - 'a']++;
        }

        int[] L = new int[26];

        for(char c : s.toCharArray()){
            int t = c - 'a';
            R[t]--;
            for(int j = 0; j < 26; j++){
                if(L[j] > 0 && R[j] > 0){
                    set.add(26 * t + j);
                }
            }
            L[t]++;
        }

        return set.size();
        
    }
}
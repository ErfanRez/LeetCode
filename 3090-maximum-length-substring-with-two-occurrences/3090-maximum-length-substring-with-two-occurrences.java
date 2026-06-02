class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n; i++){
            int[] charMap = new int[26];
            
            for(int j = i; j < n; j++ ){
                charMap[s.charAt(j) - 'a']++;

                if(charMap[s.charAt(j) - 'a'] > 2) break;

                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}
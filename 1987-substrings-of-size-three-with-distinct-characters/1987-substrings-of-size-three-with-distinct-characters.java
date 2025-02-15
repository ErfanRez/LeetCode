class Solution {
    public int countGoodSubstrings(String s) {
        int len=s.length();
        int ans=0;
        for(int i=0;i<len-2;i++){ // Iterate through substrings of length 3

            
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            char c3=s.charAt(i+2);
            // Check if all three characters are unique
            if (c1 != c2 && c2 != c3 && c3 != c1) {
                ans++; // Increment count if the substring is "good"
            }

        }
        return ans;
    }
}
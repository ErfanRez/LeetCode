class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0;
        int end = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = expandAroundCenter(s, i, i);
            int even = expandAroundCenter(s, i, i + 1);
            int len = Math.max(odd, even);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);        
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Return the length of the palindrome
    }    
}

//Python:

// class Solution:
//     def longestPalindrome(self, s: str) -> str:
//         result = ""
//         maxLen = 0

//         for i in range(len(s)):
//             l, r = i, i
//             while l >= 0 and r < len(s) and s[l] == s[r]:
//                 size = r - l + 1
//                 if size > maxLen:
//                     result = s[l:r + 1]
//                     maxLen = r - l + 1

//                 l -= 1
//                 r += 1        

//             l, r = i, i + 1    
//             while l >= 0 and r < len(s) and s[l] == s[r]:
//                 size = r - l + 1
//                 if size > maxLen:
//                     result = s[l:r + 1]
//                     maxLen = r - l + 1

//                 l -= 1
//                 r += 1        

//         return result       
        
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}

// My way:

// public int lengthOfLastWord(String s) {
//         String[] words = s.split(" ");
//         return words[words.length - 1].length();
//     }
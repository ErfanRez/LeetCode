class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        StringBuilder s = new StringBuilder(word.substring(0, index + 1));

        return s.reverse().toString() + word.substring(index + 1);
        
    }
}
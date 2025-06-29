class Solution {
    public boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) ||
                word.toLowerCase().equals(word) ||
                word.charAt(0) == Character.toUpperCase(word.charAt(0)) && word.substring(1).toLowerCase().equals(word.substring(1));
    }
}
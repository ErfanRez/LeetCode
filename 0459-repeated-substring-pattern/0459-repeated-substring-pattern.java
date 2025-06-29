class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // If s is made of some pattern p repeated, then s must appear in (s + s)
        // after removing the first and last character.
        String t = (s + s).substring(1, s.length() * 2 - 1);
        return t.contains(s);
    }
}

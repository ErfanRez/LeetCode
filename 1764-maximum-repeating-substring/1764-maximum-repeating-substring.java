class Solution {
    public int maxRepeating(String sequence, String word) {
        String s = word;
        int count = 0;

        while(sequence.contains(s)){
            count++;
            s += word;
        }

        return count;
    }
}
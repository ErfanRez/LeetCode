class Solution {
    public String longestCommonPrefix(String[] strs) {
        String perfix = strs[0];

        for(String s : strs){
            while(s.indexOf(perfix) != 0){ //s.indexOf("") = 0
                perfix = perfix.substring(0, perfix.length() - 1);
            }
        }

        return perfix;
    }
}
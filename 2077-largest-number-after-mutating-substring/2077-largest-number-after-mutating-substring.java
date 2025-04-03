class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder result = new StringBuilder(num);
        boolean changed = false;

        for(int i = 0; i < num.length(); i++){
            int val = num.charAt(i) - '0';
            if(change[val] > val){
                result.setCharAt(i, (char) (change[val] + '0'));
                changed = true;
            }
            if(change[val] < val && changed){
                 break;
             }
        }

        return result.toString();
    }
}
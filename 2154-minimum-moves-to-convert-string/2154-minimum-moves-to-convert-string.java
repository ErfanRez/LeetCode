class Solution {
    public int minimumMoves(String s) {
        int i = 0;
        int ans = 0; 
        int n = s.length();

        while( i < n){
            if(s.charAt(i) == 'X'){
                ans++;
                i += 2;
            }
            i++;
        }
        
        return ans;
        
    }
}
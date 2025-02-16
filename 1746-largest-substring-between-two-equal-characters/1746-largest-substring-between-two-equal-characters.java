class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = -1;
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                result = Math.max(result, i - map.get(curr) - 1);
            }else{
                map.put(curr, i);
            }
        }

        return result;
        
    }
}
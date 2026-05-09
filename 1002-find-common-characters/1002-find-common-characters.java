class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];

        for(char c : words[0].toCharArray()){
            freq[c - 'a']++;
        }

        for(int i = 1; i < words.length; i++){
            int[] temp = new int[26];
            for(char c : words[i].toCharArray()){
                temp[c - 'a']++;
            }

            for(int j = 0; j < 26; j++){
                freq[j] = Math.min(freq[j] , temp[j]);
            }
        }

        List<String> result = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                while(freq[i]-- > 0) result.add(String.valueOf((char)('a' + i)));
            }
        }

        return result;

    }
}
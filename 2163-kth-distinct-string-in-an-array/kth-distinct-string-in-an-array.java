class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();

        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int j = 1;
        for(String s : arr){
            if(map.containsKey(s)){
                if(map.get(s) > 1){
                    map.remove(s);
                } else {
                map.put(s, j);
                j++;
            }
            }
        }

        for(String key : map.keySet()){
            if(map.get(key) == k) return key;
        }

        return "";

    }
}
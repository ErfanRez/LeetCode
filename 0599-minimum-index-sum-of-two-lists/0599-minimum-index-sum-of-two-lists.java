class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            String w = list1[i];
            map.put(w, i);
        }

        Map<String, Integer> commons = new HashMap<>();
        List<String> result = new ArrayList<>();

        for(int i = 0; i < list2.length; i++){
            String w = list2[i];
           if(map.containsKey(w)){
                commons.put(w, map.get(w) + i);
           }
        }

        int minValue = Collections.min(commons.values());

        for(String w : commons.keySet()){
            if(commons.get(w) == minValue)
                result.add(w);
        }

        return result.toArray(new String[0]);
    }
}
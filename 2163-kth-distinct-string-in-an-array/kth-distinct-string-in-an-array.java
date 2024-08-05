class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> orderMap = new LinkedHashMap<>();
        
        for (String str : arr) {
            orderMap.put(str, orderMap.getOrDefault(str, 0) + 1);
        }
        
        for (String key : orderMap.keySet()) {
            if (orderMap.get(key) == 1 && --k == 0) {
                return key;
            }
        }
        
        return "";
    }
}
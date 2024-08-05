class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> orderMap = new LinkedHashMap<>();
        
        for (String str : arr) {
            orderMap.put(str, orderMap.getOrDefault(str, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            if (entry.getValue() == 1 && --k == 0) {
                return entry.getKey();
            }
        }
        
        return "";
    }
}
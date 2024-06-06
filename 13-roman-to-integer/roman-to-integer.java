import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M' , 1000);
        int sum = 0;
        int i = s.length() - 1;
        while(i >= 0){
            int x = romanToInt.get(s.charAt(i));
            int y = i > 0 ? romanToInt.get(s.charAt(i-1)) : 0; 
            if (x > y){
                sum += (x-y);
                i -= 2;
            }else{
                sum += x;
                i -= 1;
            }
        }

        return sum;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) red++;
            if(nums[i] == 1) white++;
            if(nums[i] == 2) blue++;
        }

        for(int i = 0; i < red; i++){
            nums[i] = 0;
        }

        int a = red + white;
        for(int i = red; i < a; i++){
            nums[i] = 1;
        }

        int b = a + blue;
        for(int i = a; i < b; i++){
            nums[i] = 2;
        }
        
    }
}
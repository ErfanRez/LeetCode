class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n <= 0) return false;
        if(n == 1) return true;
        // multuple of 2 will only have a single 1 in their binary representation.
        //Big-O = O(1)
        int cnt = Integer.bitCount(n);

        return cnt == 1;

        
    }

    //Recursive approach, O(logn)
    // public boolean isPowerOfTwo(int n) { 
    //     if(n <= 0) return false;
    //     if(n == 1) return true;

    //     //We divide the number by 2 if we reach 1 is power of two otherwise it's not.
    //     return (n % 2 == 0) && isPowerOfTwo(n / 2); 
        
    // }
}
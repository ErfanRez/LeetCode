class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return result;
    }
}

//Explaination:

// For every additional digit of the string, we multiply the value of the digit by 26^n where n is the number of digits it is away from the one's place. This is similar to how the number 254 could be broken down as this: (2 x 10 x 10) + (5 x 10) + (4). The reason we use 26 instead of 10 is because 26 is our base.

// For s = "BCM" the final solution would be (2 x 26 x 26) + (3 x 26) + (13)

// We could do this process iteratively. Start at looking at the first digit "B". Add the int equivalent of "B" to the running sum and continue. Every time we look at the following digit multiply our running sum by 26 before adding the next digit to signify we are changing places. Example below:

// "B" = 2
// "BC" = (2)26 + 3
// "BCM" = (2(26) + 3)26 + 13
class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        char[] result = new char[Math.max(a.length(), b.length()) + 1];
        int k = result.length - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result[k--] = (char) ('0' + (sum % 2));
            carry = sum / 2;
        }

        return new String(result, k + 1, result.length - k - 1);
    }
}
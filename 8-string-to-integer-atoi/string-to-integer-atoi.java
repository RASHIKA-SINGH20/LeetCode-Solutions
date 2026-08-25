class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        int i = 0;
        int sign = 1;
        long num = 0;

        if (s.length() == 0) {
            return 0;
        }

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }

         // Read digits until a non-digit character is found
        while (i < s.length()) {

            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }
            // Build the number digit by digit
            num = num * 10 + (ch - '0');

            if (sign == 1 && num > Integer.MAX_VALUE) //overflow
            {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) //overflow
            {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}
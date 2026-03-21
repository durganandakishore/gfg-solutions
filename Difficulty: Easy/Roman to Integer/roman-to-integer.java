class Solution {
    public int romanToDecimal(String s) {
        // code here
         int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = 0;
            int next = 0;
            char c = s.charAt(i);
            if (c == 'I') curr = 1;
            else if (c == 'V') curr = 5;
            else if (c == 'X') curr = 10;
            else if (c == 'L') curr = 50;
            else if (c == 'C') curr = 100;
            else if (c == 'D') curr = 500;
            else curr = 1000;
            if (i < s.length() - 1) {
                char n = s.charAt(i + 1);
                if (n == 'I') next = 1;
                else if (n == 'V') next = 5;
                else if (n == 'X') next = 10;
                else if (n == 'L') next = 50;
                else if (n == 'C') next = 100;
                else if (n == 'D') next = 500;
                else next = 1000;
            }

            if (curr < next) sum -= curr;
            else sum += curr;
        }

        return sum;
    }
}
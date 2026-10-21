
class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int curr;

            if (c == 'I') curr = 1;
            else if (c == 'V') curr = 5;
            else if (c == 'X') curr = 10;
            else if (c == 'L') curr = 50;
            else if (c == 'C') curr = 100;
            else if (c == 'D') curr = 500;
            else curr = 1000;

            if (curr < prev) ans -= curr;
            else ans += curr;

            prev = curr;
        }

        return ans;
    }
}

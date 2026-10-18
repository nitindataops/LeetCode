class Solution {
    public int mySqrt(int x) {
        // Base cases ko loop se pehle hi handle kar lein
        if (x < 2) return x; 
        
        int l = 1, r = x;
        while (l < r) {
            // Unsigned right shift (>>>) division se kaafi tez hota hai
            int mid = (l + r + 1) >>> 1; 
            
            if (mid > x / mid) {
                r = mid - 1; // Agar bada hai toh range choti karein
            } else {
                l = mid; // l ko mid par shift karein
            }
        }
        return l;
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        long large = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            long n=nums[i];
            if (n == large || n == second || n == third) {
                continue;
            }
            if (n > large) {
                third = second;
                second = large;
                large = n;
            } else if (n > second && n!=large) {
                third = second;
                second = n;
            } else if (n > third && n!=large && n!=second) {
                third = n;
            }
        }
        if(third==Long.MIN_VALUE){
            return (int)large;
        }
        return (int)third;
    }
}
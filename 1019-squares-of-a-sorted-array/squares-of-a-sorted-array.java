class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int p = ans.length - 1;
        while (start <=end) {
            int startSquare = nums[start] * nums[start];
            int endSquare = nums[end] * nums[end];
            if (startSquare > endSquare) {
                ans[p] = startSquare;
                start++;
            } else {
                ans[p] = endSquare;
                end--;
            }
            p--;

        }
        return ans;
    }
}
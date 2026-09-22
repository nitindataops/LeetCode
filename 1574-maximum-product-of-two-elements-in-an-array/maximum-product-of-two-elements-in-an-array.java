class Solution {
    public int maxProduct(int[] nums) {
        int large=0;
        int secondlarge=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                secondlarge=large;
                large=nums[i];
            }else if(nums[i]>secondlarge){
                secondlarge=nums[i];
            }
        }
        return (large-1) * (secondlarge-1);
    }
}
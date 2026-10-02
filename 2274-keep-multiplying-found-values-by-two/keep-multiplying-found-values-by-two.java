class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found=true;
        while(found){
            found=false; // man lete hai ki nhi mila to loop yahi terminate ho jayega
            for(int num:nums){
                if(num==original){
                    original*=2; // original mil gya to double kr dega
                    found=true; // original mil gya to loop fir se chalega
                    break;      // array ke khatam hone par loop break ho jayega;
                    
                }
            }
        }
        return original;
    }
}

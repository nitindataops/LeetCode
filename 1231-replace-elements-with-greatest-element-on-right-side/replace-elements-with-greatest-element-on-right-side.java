class Solution {
    public int[] replaceElements(int[] arr) {
        int maxfromright = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i]=maxfromright;
            if (current > maxfromright) {
                maxfromright = current;
            }

        }
        return arr;
    }
}
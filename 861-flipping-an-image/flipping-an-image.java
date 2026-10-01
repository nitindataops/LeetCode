class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int row = 0; row < n; row++) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                int temp = 1- image[row][start];
                image[row][start] = 1- image[row][end];
                image[row][end] = temp;
                start++;
                end--;

            }

        }
        return image;
    }
}
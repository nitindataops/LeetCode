class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int value = 1;
        while (value <= n * n) {
            for (int i = left; i <= right; i++) { // left to right
                matrix[top][i] = value;
                value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) { // top to bottom
                matrix[i][right] = value;
                value++;
            }
            right--;
            for (int i = right; i >= left; i--) { // right to left
                matrix[bottom][i] = value;
                value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) { // bottom to top
                matrix[i][left] = value;
                value++;
            }
            left++;
        }
        return matrix;
    }
}
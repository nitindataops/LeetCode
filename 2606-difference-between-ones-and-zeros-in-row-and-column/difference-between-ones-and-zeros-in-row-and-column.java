class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] oneRow = new int[m];
        int[] oneCol = new int[n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    oneRow[row]++;
                    oneCol[col]++;
                }
            }
        }
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = 2 * oneRow[i] + 2 * oneCol[j] - n - m;
            }
        }
        return diff;
    }
}
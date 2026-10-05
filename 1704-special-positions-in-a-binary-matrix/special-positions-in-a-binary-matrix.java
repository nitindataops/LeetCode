class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowSum = new int[m];
        int[] colSum = new int[n];
        int count = 0;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                rowSum[row] += mat[row][col];
                colSum[col] += mat[row][col];

            }
        }
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (mat[row][col] == 1 && rowSum[row] == 1 && colSum[col] == 1) {
                    count++;
                }
            }
        }

        return count;

    }
}
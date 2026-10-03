class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                rowMin[row] = Math.min(rowMin[row], matrix[row][col]);
                colMax[col] = Math.max(colMax[col], matrix[row][col]);

            }
        }
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (rowMin[row]== colMax[col]) {
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;

    }
}
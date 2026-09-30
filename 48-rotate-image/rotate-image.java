class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int row=0;row<n;row++){
            for(int col=row+1;col<n;col++){
                int swap=matrix
                [row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=swap;
            }
        }
        for(int row=0;row<n;row++){
            int startCol=0;
            int endCol=n-1;
            while(startCol<endCol){
                int swap=matrix[row][startCol];
                matrix[row][startCol]=matrix[row][endCol];
                matrix[row][endCol]=swap;
                startCol++;
                endCol--;
            }
        }
    }
}
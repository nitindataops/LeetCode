class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++)
            if(i==j || i+j==n-1){
            totalSum+=mat[i][j];
            }
        }
        return totalSum;   
    }
}
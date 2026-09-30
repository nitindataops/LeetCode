class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=mat[i][i]; //sum of primary diagonal
            totalSum+=mat[i][n-1-i]; //sum of secondary diagonal

        }
        if(n%2==1){
            totalSum-=mat[n/2][n/2];
        }     
        return totalSum;   
    }
}
class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        int j=n-1;
        for(int row=0;row<m;row++){
            while(j>=0 && grid[row][j]<0) {
               j--;
            }
            count+=(n-1-j);
        }
        return count;  
    }
}

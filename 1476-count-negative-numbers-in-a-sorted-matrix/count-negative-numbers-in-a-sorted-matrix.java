class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]<0){
                    count++;
                }
            }
        }
        return count;  
    }
}
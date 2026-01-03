class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int [] temp: dp){
            Arrays.fill(temp,-1);
        }
        dp[0][0] = grid[0][0];
        return helper(m-1,n-1,grid,dp);
    }


    public static int helper(int i,int j ,int [][] grid,int dp[][]){
        if(i <0 || j <0)return 0;

        int left =Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(dp[i][j] != -1)return dp[i][j];

        if(j-1 >=0){
            left = helper(i,j-1,grid,dp);
        }
        if(i-1 >=0){
            right = helper(i-1,j,grid,dp);
        }
    
        dp[i][j] = Math.min(left,right)  + grid[i][j];
        return dp[i][j];
    }
}
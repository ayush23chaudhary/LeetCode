class Solution {
    public int minFallingPathSum(int[][] g) {
        int n=g.length;
        int m=g[0].length;
        int dp[][]=new int [n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=g[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = Integer.MAX_VALUE; 
                for(int k=0;k<m;k++){
                    if(k!=j)dp[i][j]=Math.min(dp[i][j],dp[i-1][k]+g[i][j]);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}
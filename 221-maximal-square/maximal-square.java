class Solution {
    public int maximalSquare(char[][] arr) {
        int[][] dp= new int[arr.length][arr[0].length];
        for(int[] a:dp){
            Arrays.fill(a,0);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==0 || j==0){
                    if(arr[i][j]=='1'){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=0;
                    }
                    ans=Math.max(ans,dp[i][j]);
                    
                }
                else{
                    if(arr[i][j]=='1'){
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                        ans=Math.max(ans,dp[i][j]);
                    }
                    
                }
            }
        }
        return ans*ans;

    }
    // pubic int maxsq(int[][] dp,char[][] arr,int i,int j){
    //     if(i==arr.length ||  j==arr[0].length){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }
    //     if(arr[i][j]=='1'){
            
    //     }
    // }
}
class Solution {
    public int rob(int[] nums) {
        int [] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return house(nums,dp,0);


    }
    public static int  house(int[] arr, int[] dp, int i){
        if(i>arr.length-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+ house(arr,dp,i+2);
        int dont_rob=house(arr,dp,i+1);
        return dp[i]= Math.max(rob,dont_rob);

    }
}
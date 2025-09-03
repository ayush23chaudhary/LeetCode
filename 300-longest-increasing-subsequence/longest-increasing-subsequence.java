class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums, nums.length);
        
    }
    public static int LIS(int[] arr,int n){
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
                

            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
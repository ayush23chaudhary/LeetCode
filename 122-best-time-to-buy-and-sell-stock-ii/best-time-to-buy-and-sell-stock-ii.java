class Solution {
    public int maxProfit(int[] prices) {

        int dp[][] = new int[prices.length][2];
        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return f(0, 1, prices, dp);

    }

    public int f(int index, int buy, int prices[], int dp[][]) {
        if (index == prices.length)
            return 0;
        if (dp[index][buy] != -1)
            return dp[index][buy];
        if (buy == 1) {
            dp[index][buy] = Math.max(-prices[index] + f(index + 1, 0, prices, dp), f(index + 1, 1, prices, dp));
        } else {
            dp[index][buy] = Math.max(prices[index] + f(index + 1, 1, prices, dp), f(index + 1, 0, prices, dp));
        }

        return dp[index][buy];
    }
}
// Last updated: 8/21/2025, 12:06:29 PM
public class Solution {
    private static final int M = 1000000007;

    private int mul(long x, long y) {
        return (int) (x * y % M);
    }

    private int add(int x, int y) {
        x += y;
        if (x >= M) {
            x -= M;
        }
        return x;
    }

    public int stringCount(int n) {
        int[][][] dp = new int[2][2][3];
        dp[0][0][0] = 1;

        for (int i = 0; i < n; ++i) {
            int[][][] temp = new int[2][2][3];

            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < 2; ++k) {
                    for (int h = 0; h < 3; ++h) {
                        if (dp[j][k][h] == 0) continue;
                        temp[j][k][h] = add(temp[j][k][h], mul(dp[j][k][h], 23));
                        temp[1][k][h] = add(temp[1][k][h], dp[j][k][h]);
                        temp[j][1][h] = add(temp[j][1][h], dp[j][k][h]);
                        temp[j][k][Math.min(h + 1, 2)] = add(temp[j][k][Math.min(h + 1, 2)], dp[j][k][h]);
                    }
                }
            }

            dp = temp;
        }

        return dp[1][1][2];
    }
}
// Last updated: 8/21/2025, 12:06:39 PM
class Solution {
        public int minimumBeautifulSubstrings(String s) {
        int n = s.length(), dp[] = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') continue;
            for (int j = i, cur = 0; j < n; j++) {
                cur = cur * 2 + s.charAt(j) - '0';
                if (15625 % cur == 0)
                    dp[j + 1] = Math.min(dp[j + 1], dp[i] + 1);
            }
        }
        return dp[n] > n ? -1 : dp[n];
    }
}
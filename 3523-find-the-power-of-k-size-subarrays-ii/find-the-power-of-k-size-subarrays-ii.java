class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && nums[i] != nums[i + 1] - 1) {
                pre[i] = 1;
            }
            pre[i] += i > 0 ? pre[i - 1] : 0;
        }
        int[] ans = new int[n - k + 1];
        for (int j = k - 1; j < n; j++) {
            int right = j - 1 >= 0 ? pre[j - 1] : 0;
            int left = j - (k - 1) - 1 >= 0 ? pre[j - (k - 1) - 1] : 0;
            int count = right - left;
            if (count == 0)
                ans[j - (k - 1)] = nums[j];
            else
                ans[j - (k - 1)] = -1;
        }
        return ans;
    }
}
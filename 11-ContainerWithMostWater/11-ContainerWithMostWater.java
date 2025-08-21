// Last updated: 8/21/2025, 12:12:08 PM
class Solution {
    public int maxArea(int[] height) {
      int ans = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
        final int minHeight = Math.min(height[l], height[r]);
        ans = Math.max(ans, minHeight * (r - l));
        if (height[l] < height[r])
            ++l;
        else
            --r;
        }

        return ans;  
    }
}
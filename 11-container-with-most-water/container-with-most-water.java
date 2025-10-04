class Solution {
    public int maxArea(int[] height) {
        int lo=0, hi=height.length-1;
        int ans=0;
        while(lo<hi){
            int min= Math.min(height[lo],height[hi]);
            ans= Math.max((hi-lo)*min,ans);
            if(height[lo]<height[hi]){
                lo++;
            }
            else{
                hi--;
            }
        }
        return ans;
    }
}
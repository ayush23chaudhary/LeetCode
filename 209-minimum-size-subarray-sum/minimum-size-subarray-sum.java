class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int ans= Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            // if(sum>=target){
            //     ans= Math.min(ans,r-l);
            // }
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
                //ans=Math.min(ans,r-l);
            }
            r++;
            //ans= Math.min(ans,r-l+1);
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
        
    }
}
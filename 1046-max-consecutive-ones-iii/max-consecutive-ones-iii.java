class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,ans=0,flip=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flip++;
            }
            while(flip>k && l<=i){
                if(nums[l]==0){
                    flip--;
                }
                l++;
            }
            ans= Math.max(ans,i-l+1);

        }
        return ans;
        
    }
}
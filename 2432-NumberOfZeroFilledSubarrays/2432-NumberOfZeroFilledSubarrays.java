// Last updated: 8/21/2025, 12:07:22 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n= nums.length;
        long c=0,res=0;
        long ans=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res+=1;
                c=1;
            }
            else{
                ans+=(res*(res+1))/2;
                c=0;
                res=0;
            }

        }
        ans+=(res*(res+1))/2;
        return ans;

        
    }
}
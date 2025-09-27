class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>hi){
                hi=piles[i];
            }
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] nums,int k,int h ){
        int totalHours=0;
        for(int i=0;i<nums.length;i++){
            totalHours+=Math.ceil((double)nums[i]/k);
        }
        return totalHours<=h;
    }
}
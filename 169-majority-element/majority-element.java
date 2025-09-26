class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int v=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==cand){
                v++;
            }
            else{
                v--;
                if(v==0){
                    cand=nums[i];
                    v=1;
                }
            }
        }
        return cand;
        
    }
}
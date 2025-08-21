// Last updated: 8/21/2025, 12:09:31 PM
class Solution {
    public int thirdMax(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int res=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<res){
                res=nums[i];
                c++;
            }
            if(c==2){
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
        
    }
}
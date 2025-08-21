// Last updated: 8/21/2025, 12:10:16 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr= new int[2];
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            if(nums[lo]+nums[hi]==target){
                return new int[]{lo+1, hi+1};
            }
            else if(nums[lo]+nums[hi]>target){
                hi--;
            }
            else{
                lo++;
            }
        }
        return new int[]{-1, -1};

    }
}
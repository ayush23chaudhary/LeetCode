// Last updated: 8/21/2025, 12:11:50 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr= {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        if(arr[0]==-1){
            return arr;
        }
        for(int i=arr[0];i<nums.length;i++){
            if(nums[i]==target){
                arr[1]=i;
            }
        }
        return arr;
    }
}
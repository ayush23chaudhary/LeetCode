// Last updated: 8/21/2025, 12:09:49 PM
class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr= new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]-1]!=-1){
                return nums[i];
            }
            arr[nums[i]-1]=nums[i];
        }
        return -1;
    }
}
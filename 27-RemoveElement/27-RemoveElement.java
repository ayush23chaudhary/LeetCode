// Last updated: 8/21/2025, 12:11:58 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i]=51;
            }
        }
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]== 51){
                break;
            }
            c++;
        }
        return c;
    }
}
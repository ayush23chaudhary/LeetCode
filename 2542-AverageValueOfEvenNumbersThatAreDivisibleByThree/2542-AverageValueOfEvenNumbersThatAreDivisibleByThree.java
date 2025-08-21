// Last updated: 8/21/2025, 12:07:08 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                c++;
                sum+=nums[i];
            }
        }
        if(c!=0){
            return sum/c;
        }
        return 0;
        
    }
}
// Last updated: 8/21/2025, 12:11:59 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[j]=1000;
                }
            }
        }
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1000){
                break;
            }
            c++;
        }
        return c;

    }
}
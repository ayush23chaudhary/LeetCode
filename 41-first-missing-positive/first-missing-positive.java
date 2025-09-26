class Solution {
    public int firstMissingPositive(int[] nums) {
        int hi=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                // swap(i,hi,nums);
                // hi--;
                nums[i]=Integer.MAX_VALUE;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            while(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]){
                swap(nums[i]-1,i,nums);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
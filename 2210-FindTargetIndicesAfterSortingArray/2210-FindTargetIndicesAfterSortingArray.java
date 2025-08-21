// Last updated: 8/21/2025, 12:07:42 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1= new ArrayList<>();
    
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l1.add(i);
                // if( i!=nums.length-1 && nums[i+1]!=target ){
                //     return l1;
                // }
            }
        }
        return l1;

        
    }
}
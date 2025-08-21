// Last updated: 8/21/2025, 12:11:38 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l1= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        permu(ans,l1,nums);
        return ans;

        
    }
    static void permu(List<List<Integer>> list , List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
        list.add(new ArrayList<>(tempList));
        } 
        else{
            for(int i = 0; i < nums.length; i++){ 
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                permu(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
// Last updated: 8/21/2025, 12:11:07 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l1= new ArrayList<>();
        // int p=(int) Math.pow(2,nums.length);
        subset(nums,ans,l1,0);
        return ans;

    }
    static void subset(int[] nums,List<List<Integer>> ans,List<Integer> l1,int idx){
        if(nums.length==idx){
            ans.add(new ArrayList<>(l1));
            return;
        }
        
        l1.add(nums[idx]);
        subset(nums,ans,l1,idx+1);
        l1.remove(l1.size()-1);
        subset(nums,ans,l1,idx+1);
    }
}
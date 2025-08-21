// Last updated: 8/21/2025, 12:11:45 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> l1= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        permu(candidates,target,l1,0,ans);
        return ans;
    }
    public static void permu(int[] coin,int amount,List<Integer> l1,int idx,List<List<Integer>> ans){
        if (amount==0){
//            System.out.println(ans);
            ans.add(new ArrayList<>(l1));
            return;
        }
        for (int i=idx;i<coin.length;i++){
            if (amount>=coin[i]){
                l1.add(coin[i]);
                permu(coin,amount-coin[i],l1,i,ans);
                l1.remove(l1.size()-1);
                
            }

        }

    }
}
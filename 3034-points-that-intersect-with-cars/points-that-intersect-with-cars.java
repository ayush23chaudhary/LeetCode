class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // Collections.sort(nums,(a,b)->a.get(0)-b.get(0));
        // int ans=0;

        // for(int i=0;i<nums.length-1;i++){

        // }
        int time=-1;
        int[] ans= new int[101];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                ans[j]++;
                time=Math.max(time,nums.get(i).get(1));
            }
        }
        int sum=0;
        for(int i=1;i<time+1;i++){
            if(ans[i]==-1){
                sum++;
            }
        }
        return time-sum;

    }
}
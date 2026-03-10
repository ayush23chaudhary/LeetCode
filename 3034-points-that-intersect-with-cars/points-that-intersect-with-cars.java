class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        // Collections.sort(nums,(a,b)->a.get(0)-b.get(0));
        // int ans=0;

        // for(int i=0;i<nums.length-1;i++){

        // }
        int time=-1;
        int[] ans= new int[102];

        for(int i=0;i<nums.size();i++){
            int end=nums.get(i).get(1);
            ans[nums.get(i).get(0)]++;
            
            ans[end+1]--;
            time=Math.max(time,end);

        }
        int sum=0;
        int count=0;
        for(int i=1;i<=time;i++){
            sum+=ans[i];
            if(sum==0){
                count++;
            }
        }
        return time-count;

    }
}
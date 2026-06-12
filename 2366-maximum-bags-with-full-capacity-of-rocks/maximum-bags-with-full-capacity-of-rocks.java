class Solution {
    public int maximumBags(int[] cap, int[] rocks, int add) {
        for(int i=0;i<cap.length;i++){
            cap[i]=cap[i]-rocks[i];
        }
        Arrays.sort(cap);
        int ans=0;
        for(int i=0;i<cap.length;i++){
            if(add<=0){
                return ans;
            }
            if(cap[i]==0){
                ans++;
            }
            if(cap[i]>0){
                add-=cap[i];
                if(add<0){
                    return ans;
                }
                ans++;
            }
        }
        return ans;
    }
}
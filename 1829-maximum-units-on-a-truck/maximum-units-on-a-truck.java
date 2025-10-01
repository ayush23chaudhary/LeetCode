class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans=0;
        int temp=truckSize;
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            if(boxTypes[i][0]<temp){
                ans+=(boxTypes[i][0]*boxTypes[i][1]);
                temp-=boxTypes[i][0];

            }
            else{
                ans+=(temp*boxTypes[i][1]);
                return ans;
            }

            
        }
        return ans;
        
    }
}
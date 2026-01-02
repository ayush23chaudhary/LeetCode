class Solution {
    public int edgeScore(int[] edges) {
        long[] arr= new long[edges.length];
        for(int i=0;i<edges.length;i++){
            arr[edges[i]]+=i;
        }
        int ans=0;
        long max=-1;
        for(int i=0;i<edges.length;i++){
            if(arr[i]>max){
                ans=i;
                max=arr[i];
            }
        }
        return ans;
    }
}
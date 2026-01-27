class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int el=arr[k];
        int sum=0;
        for(int i=0;i<k;i++){
            if(arr[i]<el){
                sum+=arr[i];
            }
            else{
                sum+=el;
            }
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<=el-1){
                sum+=arr[i];
            }
            else{
                sum+=(el-1);
            }
        }
        return sum+1;
    }
}
class Solution {
    public int maxIceCream(int[] arr, int n) {
        Arrays.sort(arr);
        long ans=0;
        long sum=0;
        for(int i:arr){
            sum+=i;
            if(sum<=n){
                ans++;
            }
        }
        return (int)ans;
    }
}
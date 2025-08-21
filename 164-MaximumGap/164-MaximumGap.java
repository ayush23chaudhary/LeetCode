// Last updated: 8/21/2025, 12:10:19 PM
class Solution {
    public int maximumGap(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum=Math.max(sum,arr[i]-arr[i-1]);
        }
        return sum;
        
    }
}
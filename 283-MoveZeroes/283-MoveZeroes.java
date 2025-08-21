// Last updated: 8/21/2025, 12:09:50 PM
class Solution {
    public void moveZeroes(int[] arr) {
        int ze=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                ze++;
            }
            else if(ze>0){
                int t= arr[i];
                arr[i]=0;
                arr[i-ze]=t;
            }
        }
    }
}
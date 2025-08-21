// Last updated: 8/21/2025, 12:11:48 PM
class Solution {
    public int searchInsert(int[] arr, int target) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                return i;
            }
        }
        return arr.length;
    }
}
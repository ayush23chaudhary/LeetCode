// Last updated: 8/21/2025, 12:09:13 PM
class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target);
    }
    public static int binary(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while (lo <= hi) {
            int mid=(lo+hi)/2;
            if (arr[mid]==item){
                return mid;
            } else if (arr[mid]>item) {
                hi=mid-1;

            }else {
                lo=mid+1;
            }
        }
        return -1;
    }
}
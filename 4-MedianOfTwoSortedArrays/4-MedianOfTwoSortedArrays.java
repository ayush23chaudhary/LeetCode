// Last updated: 8/21/2025, 12:12:15 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int c=a+b;
        int[] arr= new int[c];
        for(int i=0;i<a;i++){
            arr[i]=nums1[i];
        }
        for (int j=0;j<b;j++){
            arr[a+j]=nums2[j];
        }
        Arrays.sort(arr);
        int f= (int) Math.floor((c+1)/2);
        int ce= (int) Math.ceil((c+2)/2);
        return (arr[f-1]+arr[ce-1])/2.0;

    }
}
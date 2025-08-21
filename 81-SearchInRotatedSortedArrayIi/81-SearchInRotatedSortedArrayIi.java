// Last updated: 8/21/2025, 12:11:03 PM
class Solution {
    public boolean search(int[] arr, int target) {
        int k=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                k=(i-1);
                reverse(arr,0,k);
                reverse(arr,k+1,n-1);
                reverse(arr,0,n-1);
                break;
            }
        }
        

        int hi=n-1;
        int lo=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]>target){
                hi=mid-1;
            }
            else if(arr[mid]==target){
                return true;
            }
            else{
                lo=mid+1;
            }
        }
        return false;

        
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
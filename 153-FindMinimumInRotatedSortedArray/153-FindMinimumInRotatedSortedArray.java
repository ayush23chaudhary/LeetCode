// Last updated: 8/21/2025, 12:10:26 PM
class Solution {
    public int findMin(int[] arr) {
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
        

        return arr[0];

        
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
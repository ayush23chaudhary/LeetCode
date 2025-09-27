class Solution {
    public int search(int[] arr, int target) {
        int k=0;
        int n=arr.length;
        if(n==1 && target==arr[0]){
            return 0;
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                k=(i-1);
                if(target>=arr[0] && target<= arr[k]){
                    return binary(arr,0,k,target);
                }
                else{
                    return binary(arr,k+1,n-1,target);
                }
                
            }
        
        }
        return binary(arr,0,n-1,target);
    }

    public static int binary(int[] arr, int lo, int hi,int target){
        // 
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (arr[mid]>target){
                hi=mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;

    }
        
    // public static void reverse(int[] arr,int i,int j){
    //     while(i<j){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
}
// Last updated: 8/21/2025, 12:09:56 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        return product(nums);
    }
    public static int[] product(int[] arr){
        int n= arr.length;
        int[] left= new int[n];
        int[] right= new int[n];
        // making left array
        left[0]=1;
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
            
        }
        //making right array
        right[n-1]=1;
        for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        int pro=1;
        for(int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
        }
        return arr;
    }
}
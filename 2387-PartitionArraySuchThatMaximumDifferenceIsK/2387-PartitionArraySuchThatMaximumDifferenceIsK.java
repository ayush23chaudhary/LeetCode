// Last updated: 8/21/2025, 12:07:26 PM
class Solution {
    public int partitionArray(int[] arr, int k) {
        Arrays.sort(arr);
        int min=arr[arr.length-1],max=0;
        int c=1,count=0;

        for(int i=0;i<arr.length;i++){
            if(c==1){
                min=Math.min(min,arr[i]);
                max=arr[i];
                if((max-min)>k){
                    count++;
                    if(i!=arr.length-1){
                        min=arr[i];
                    }
                    
                }
            }
        }
        return ++count;  
    }
}
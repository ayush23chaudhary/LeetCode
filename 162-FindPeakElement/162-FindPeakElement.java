// Last updated: 8/21/2025, 12:10:22 PM
class Solution {
    public int findPeakElement(int[] arr) {
        int c=0;
        int counter=1;
        for( int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                c=i;
                counter=0;
                break;
            } 
        }
        if(counter==1){
            return arr.length-1;
        }
        return c;


    }
}
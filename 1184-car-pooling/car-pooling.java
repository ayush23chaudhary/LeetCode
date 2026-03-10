class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        //TreeMap<Integer,Integer> map= new TreeMap<>();
        int[] arr= new int[1001];
        for(int[] ar:trips){
            arr[ar[1]]+=ar[0];
            arr[ar[2]]-=ar[0];
        }
        int sum=0;
        for(int i=0;i<1001;i++){
            sum+=arr[i];
            if(sum>capacity){
                return false;
            }
        }
        return true;

        
        // int c=0
        // Arrays.sort(trips,(a,b)->a[1]-b[1]);
        // for(int i=0;i<trips.length-1;i++){
        //     c+=trips[i][0];
        //     if(c>capacity){
        //         if(trips[i][2]<=trips[i+1][1]){

        //         }

        //     }
        //     else{
        //         return false;
        //     }
        // }
    }
}
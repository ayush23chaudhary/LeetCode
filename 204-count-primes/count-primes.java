class Solution {
    public int countPrimes(int n) {
        int[] arr= new int[n+1];
        Arrays.fill(arr,-1);
        for(int i=2;i*i<=n;i++){
            int j=2;
            if(arr[i]==-1){
                while(j*i<=n){
                    arr[j*i]++;
                    j++;
                }

            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==-1){
                count++;
            }
        }
        return count;
        
    }
}
class Solution {
    public boolean isPerfectSquare(int n) {
        if(n==1) return true;
        long lo=0;
        long hi=n/2;
        boolean c=false;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==(long)n){
                return true;
            }
            else if(mid*mid<(long)n){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return c;
        
    }
}
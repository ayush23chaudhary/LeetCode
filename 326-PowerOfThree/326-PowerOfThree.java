// Last updated: 8/21/2025, 12:09:43 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        int p=0;
        int ans=0;
        return isTrue(n,p);


    }
    public static boolean isTrue(int n, int p){
        double ans=Math.pow(3,p);
        if(n==ans){
            return true;
        }
        else if(ans>n){
            return false;
        }
        
        return isTrue(n,p+1);
    
    }
}
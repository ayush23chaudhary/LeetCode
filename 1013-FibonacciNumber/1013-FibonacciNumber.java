// Last updated: 8/21/2025, 12:09:05 PM
class Solution {
    public int fib(int n) {
        int ans=0;
        if(n==0){
            return 0;
        }
        if(n<2){
            return ans+1;
        }
        return ans+=fib(n-1)+fib(n-2);
    }
}
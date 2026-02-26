class Solution {
    public int numSteps(String s) {
        if(s.equals("1")){
            return 0;
        }
        int steps=0,carry=0;
        for(int i=s.length()-1;i>0;i--){
            if((s.charAt(i)&1)+carry==1){
                steps+=2;
                carry=1;
            }
            else{
                steps++;
            }
        }
        return steps+carry;
        // int n=0;
        // int c=1;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i)=='1'){
        //         n+=c;
        //         c*=2;

        //     }
        //     else{
        //         c*=2;
        //     }
        // }
        // // return n;
        // int ans=0;
        // while(n>1){
        //     if(n%2==0){
        //         ans+=1;
        //         n/=2;
        //     }
        //     else{
        //         ans+=2;
        //         n=(n+1)/2;
        //     }
        // }
        //return ans;
    }
}
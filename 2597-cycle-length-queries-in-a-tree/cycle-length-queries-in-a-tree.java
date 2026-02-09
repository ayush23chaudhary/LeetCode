class Solution {
    public int[] cycleLengthQueries(int ni, int[][] queries) {
        int n= queries.length;
        int[] ans=new int[n];
        int i=0;
        for(int[] arr:queries){
            int a =arr[0], b=arr[1];
            int cnt=0;
            while(a!=b){
                if(a>b){
                    a=a/2;
                    cnt++;

                }
                else{
                    b=b/2;
                    cnt++;
                }
            }
            // while(a==1){
            //     a/=2;
            //     cnt++;
                
            // }
            ans[i]=cnt+1;
            i++;
        }
        return ans;
    }
            
}
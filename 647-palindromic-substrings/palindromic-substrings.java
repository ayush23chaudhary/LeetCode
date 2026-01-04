class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(palin(s.substring(i,j+1))) ans++;
            }
        }
        return ans;
        
    }
    public boolean palin(String s){
        int n= s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
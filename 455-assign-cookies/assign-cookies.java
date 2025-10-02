class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0){
            return 0;
        }
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int r=0,idx=0;
        while(r<s.length){
            if(idx==g.length){
                break;
            }
            if(s[r] >= g[idx]){
                idx++;
                ans++;
            }
            r++;
        }
        return ans;
        
    }
}
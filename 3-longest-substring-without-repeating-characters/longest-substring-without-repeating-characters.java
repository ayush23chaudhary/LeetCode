class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int l=0,r=0;
        int ans=0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            else{
                while(l<=r && set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                //set.add(s.charAt(r));
            }
            ans= Math.max(ans,r-l);

        }
        return ans;
            
    }
}
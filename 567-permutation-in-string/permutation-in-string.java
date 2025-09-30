class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lo=0,hi=s1.length()-1;
        s1=getKey(s1);
        while(hi<s2.length()){
            if(getKey(s2.substring(lo,hi+1)).equals(s1)){
                return true;
            }
            lo++;
            hi++;
        }
        return false;

        
    }
    public static String getKey(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                sb.append((char)(i+97));

            }
        }
        return sb.toString();
    }
}
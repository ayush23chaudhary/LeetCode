class Solution {
    public boolean detectCapitalUse(String s) {
        if(s.length()==1){
            return true;

        }
        int st=0,c=0,l=0;
        boolean flag =false;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(i==0 && (ch-'A'>=0 && ch-'A'<=25)){
                st+=1;
                c++;
                flag=true;

            }
            else if((ch-'A'>=0 && ch-'A'<=25)){
                c++;
            }
            else{
                l++;
            }
        }
        if(flag && l==s.length()-1){
            return true;
        }
        else if(c==s.length()){
            return true;
        }
        else if(l==s.length()){
            return true;
        }
        return false;
    }
}
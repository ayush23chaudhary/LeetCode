class Solution {
    public int compress(char[] chars) {
        int ans=1;
        StringBuilder sb= new StringBuilder();
        int c=1;
        char prev=chars[0];
        for(int i=1;i<chars.length;i++){
            if(chars[i]==prev){
                c++;
            }
            else{
                ans++;
                if(c!=1){
                    sb.append(prev);
                    sb.append(c);
                    String numString = String.valueOf(c);
                    ans+=numString.length();
                }
                else{
                    sb.append(prev);
                }
                prev=chars[i];
                c=1;
                
            }
        }

        if(c!=1){
            sb.append(prev);
            sb.append(c);
            String numString = String.valueOf(c);
            ans+=numString.length();
        

        }
        else{
            sb.append(prev);
        }
        int k=0;
        for(int i=0;i<ans;i++){
            chars[i]=sb.charAt(i);

        }
        return ans;


    }
}
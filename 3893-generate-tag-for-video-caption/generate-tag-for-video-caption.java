class Solution {
    public String generateTag(String caption) {
        String[] arr= (caption.trim()).split(" ");
        StringBuilder str= new StringBuilder();
        str.append('#');
        int c=0;
        int ci=0;
        int count=0;
        for(String st :arr){
            if(c==0){
                ci=0;
                for(char ch:st.toCharArray()){
                    if(count==99){
                            break;
                        }
                    
                    str.append(Character.toLowerCase(ch));
                    count++;
                    
                }
                c++;
            }
            else{
                ci=0;
                for(char ch:st.toCharArray()){
                    if(ci==0){
                        if(count==99){
                            break;
                        }
                        str.append(Character.toUpperCase(ch));
                        count++;
                        ci++;
                    }
                    else{
                        if(count==99){
                            break;
                        }
                        str.append(Character.toLowerCase(ch));
                        count++;

                    }
                }
            }
        }
        return str.toString();
    }
}
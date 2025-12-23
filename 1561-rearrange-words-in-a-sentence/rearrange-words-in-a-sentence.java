class Solution {
    public String arrangeWords(String text) {
        String[] arr= text.trim().split(" ");
        Arrays.sort(arr,(s1,s2)-> Integer.compare(s1.length(),s2.length()));
        StringBuilder str= new StringBuilder();


        int c=0;
        int ci=0;
        int count=0;
        for(String st :arr){
            if(c!=0){
                ci=0;
                for(char ch:st.toCharArray()){
                    str.append(Character.toLowerCase(ch));
                    count++;
                    
                }
                c++;
                str.append(" ");
            }
            else{
                ci=0;
                for(char ch:st.toCharArray()){
                    if(ci==0){
                        
                        str.append(Character.toUpperCase(ch));
                        count++;
                        ci++;
                    }
                    else{
                        
                        str.append(Character.toLowerCase(ch));
                        count++;

                    }
                }
                str.append(" ");
                c++;
            }
        }
        return str.toString().trim();
        
    }
}
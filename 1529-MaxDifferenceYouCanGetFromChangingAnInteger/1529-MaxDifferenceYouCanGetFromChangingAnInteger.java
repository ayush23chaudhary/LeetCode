// Last updated: 8/21/2025, 12:08:39 PM
class Solution {
    public int maxDiff(int num) {
        String str= Integer.toString(num);
        char[] max= str.toCharArray();
        char[] min= str.toCharArray();
        char first= max[0];
        if(max[0]=='9'){
            char thi=' ';
            // for obtaining max value in above case
            for(int i=1;i<max.length;i++){
                if(max[i]!='9'){
                    thi=max[i]; // which char to change
                    break;
                }
            }
            // max char made for this case
            for(int i=0;i<max.length;i++){
                if(max[i]==thi){
                    max[i]='9';
                }
                //min char made
                if(min[i]=='9'){
                    min[i]='1';
                }
            }
        }
        else if(min[0]=='1'){
            char thi=' ';
            for(int i=1;i<max.length;i++){
                if(min[i]!='1' && min[i] !='0'){
                    thi=min[i]; // which char to change
                    break;
                }
            }
            for(int i=0;i<min.length;i++){
                if(min[i]==thi){
                    min[i]='0';
                }
                //min char made
                if(max[i]=='1'){
                    max[i]='9';
                }
            }

        }
        else{
            for(int i=0;i<max.length;i++){
                if(max[i]==first){
                    max[i]='9';
                }
                if(min[i]==first){
                    min[i]='1';
                }
            }
        }
        int maxVal = Integer.parseInt(new String(max));
        int minVal = Integer.parseInt(new String(min));

        return maxVal - minVal;
    }
}
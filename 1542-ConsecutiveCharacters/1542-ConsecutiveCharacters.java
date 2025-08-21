// Last updated: 8/21/2025, 12:08:38 PM
class Solution {
    public int maxPower(String s) {
        int count = 1; 
        int maxCount = 1;
        for(int i=0; i<s.length()-1; i++){
            if( s.charAt(i) == s.charAt(i+1)){
                count++;
                if(maxCount < count){
                    maxCount = count;
                }
            }else{
                count = 1;
            }
        }
        return maxCount;
    }
}
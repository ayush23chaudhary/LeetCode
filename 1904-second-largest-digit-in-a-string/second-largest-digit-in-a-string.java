class Solution {
    public int secondHighest(String s) {
        int[] freq= new int[10];
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                freq[ch-'0']++;
            }
        }
        int count=0;
        for(int i=freq.length-1;i>=0;i--){
            if(freq[i]>0){
                count++;
            }
            if(count==2){
                return i;
            }
        }
        return -1;
    }
}
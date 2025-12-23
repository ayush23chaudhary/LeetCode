class Solution {
    public int numWays(String s) {
        long count= 0;
        long m = s.length();
        for(int i = 0; i < m; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        if(count % 3 != 0){
            return 0;
        }
        if(count == 0){
            return (int)((m - 1) * (m - 2) / 2 % (1000000007));
        }
        long eachone = count / 3;
        long left = 0;
        long right = 0;
        long counti = 0;
        for(int i = 0; i < m; i++){
            if(s.charAt(i) == '1'){
                counti++;
            }
            if(counti == eachone){
                left++;
            }
            else if(counti == eachone * 2){
                right++;
            }
        }
        return (int)((left * right) % (1000000007));
    }
}
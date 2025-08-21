// Last updated: 8/21/2025, 12:10:41 PM
class Solution {
    public boolean isPalindrome(String s) {
        String sn="";
        for(char i:s.toCharArray()){
            if ((int) i >= 65 && (int) i <= 90){
                sn+=(char)((int)i+32);
            }
            else if ((int) i >= 48 && (int) i <= 57){
                sn+=i;
            }
            else if ((int) i >= 97 && (int) i <= 122){
                sn+=i;
            }
        }
        String snn="";
        for(int i=sn.length()-1;i>=0;i--){
            snn+=sn.charAt(i);
        }
        if(sn.equals(snn)){
            return true;
        }
        return false;
    }
}
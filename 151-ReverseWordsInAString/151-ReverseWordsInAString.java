// Last updated: 8/21/2025, 12:10:27 PM
class Solution {
    public String reverseWords(String s) {
        //String s="  the sky is    blue  ";
        s.trim();
        String[] arr=s.split("\s+");
        String ans="";
        for (int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";

        }
        return ans.trim();
    }
}
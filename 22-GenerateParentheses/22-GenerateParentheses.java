// Last updated: 8/21/2025, 12:12:02 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1=new ArrayList<>();
        parent(n,0,0,"",l1);
        return l1;
    }
    public static void parent(int n, int open, int close, String ans, List<String> l1){
        if(n==open && close==n){
//            System.out.println(ans);
            l1.add(ans);
            return;
        }
        if (close>open || open>n){
            return;
        }
        parent(n,open+1,close,ans+"(",l1);
        parent(n,open,close+1,ans+")",l1);
    }
}
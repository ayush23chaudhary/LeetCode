class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> l1= new ArrayList<>();
        part(s,ans,l1);
        return ans;

        
    }
    static void part(String s,List<List<String>> ans,List<String> l1){
        if(s.length()==0){
            ans.add(new ArrayList<>(l1));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String str= s.substring(0,cut);
            if(isPossible(str)){
                l1.add(str);
                part(s.substring(cut),ans,l1);
                l1.remove(l1.size()-1);
            }
        }
    }
    public static boolean isPossible(String s){
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
// Last updated: 8/21/2025, 12:09:34 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l1= new ArrayList<>();
        print(n,0,l1);
        return l1;
        
    }
    public static void print(int n, int curr,List<Integer> l1){
        if (curr>n){
            return;
        }
        if(curr!=0){
                    l1.add(curr);

        }
        // System.out.println(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for (;i<=9;i++){
            print(n,curr*10+i,l1);
        }
    }
}
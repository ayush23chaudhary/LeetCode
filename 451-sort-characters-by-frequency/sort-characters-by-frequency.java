class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        List<Character> l1= new ArrayList<>(map.keySet());
        Collections.sort(l1,(a,b)-> map.get(b)-map.get(a));
        StringBuilder sb= new StringBuilder();
        for(char ch:l1){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
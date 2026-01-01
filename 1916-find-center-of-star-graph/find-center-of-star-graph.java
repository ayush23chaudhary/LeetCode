class Solution {
    public int findCenter(int[][] edges) {
        // HashMap<Integer, List<Integer>> map= new HashMap<>();
        // for(int[] ed:edges){
        //     map.put(ed[0],map.getOrDefault())
        // }
        int n= edges.length+1;
        int[] arr= new int[edges.length+1];
        for(int[] ed:edges){
            arr[ed[0]-1]++;
            arr[ed[1]-1]++;
            if(arr[ed[1]-1]==n-1){
                return ed[1];
            }
            if(arr[ed[0]-1]==n-1){
                return ed[0];
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==n-1){
        //         return i+1;
        //     }
        // }
        return -1;

    }
}
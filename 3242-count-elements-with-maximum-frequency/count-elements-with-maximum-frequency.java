class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int max=0,ans=0;
        for(int key: map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ans=max;
            }
            else if(map.get(key)==max){
                ans+=max;
            }
        }
        return ans;
    }
}
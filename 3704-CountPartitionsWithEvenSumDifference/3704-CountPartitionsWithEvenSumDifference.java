// Last updated: 8/21/2025, 12:06:12 PM
class Solution {
    public int countPartitions(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        int suml=0;
        int sumr=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            suml+=nums[i];
            left[i]=suml;
            sumr+=nums[nums.length-1-i];
            right[nums.length-1-i]=sumr;
        }
        for(int i=0;i<nums.length-1;i++){
            if((left[i]-right[i+1])%2==0){
                c++;
            }
        }
        return c;
        
        
        
        
    }
}
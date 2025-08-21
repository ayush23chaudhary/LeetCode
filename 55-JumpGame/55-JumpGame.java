// Last updated: 8/21/2025, 12:11:30 PM
class Solution {
    public boolean canJump(int[] nums) {
       int r= 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > r) return false;
           r = Math.max(r, i + nums[i]);
       } 
       return true;
    }
}
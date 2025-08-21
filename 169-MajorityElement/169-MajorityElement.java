// Last updated: 8/21/2025, 12:10:15 PM
class Solution {
    public int majorityElement(int[] nums) {
        return moore(nums);
    }
    public static int moore(int[] arr){
        int e=arr[0];
        int v=1;
        for (int i=1; i<arr.length;i++){
            if (arr[i]==e){
                v++;
            }
            else {
                v--;
                if (v==0){
                    e=arr[i];
                    v=1;
                    
                }
            }
        }
        return e;
    }
}
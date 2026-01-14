class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n= nums.length;
        int[] arr= new int[n];
        int [] odd= new int[n/2];
        int evidx=0, odidx=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[evidx]=nums[i];
                evidx+=2;
            }
            else{
                arr[odidx]=nums[i];
                odidx+=2;
            }

        }
        // for(int i:odd){
        //     nums[idx3]=i;
        //     idx3+=2;
        // }
        return arr;
    }
}
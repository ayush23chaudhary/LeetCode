class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr= {-1,-1};
        int left= binarySearch(nums,target,true);
        int right= binarySearch(nums,target,false);
        arr[0]=left;
        arr[1]=right;
        return arr;

         
    }
    public int binarySearch(int[] nums,int target,boolean isLeft){
        int lo=0,hi=nums.length-1;
        int idx=-1;
        while(lo<=hi){
            int mid= lo+ (hi-lo)/2;
            if (nums[mid] > target) {
	            hi = mid - 1;
	        } else if (nums[mid] < target) {
	            lo = mid + 1;
	        } else {
	            idx = mid;
	            if (isLeft) {
	                hi = mid - 1;
	            } else {
	                lo = mid + 1;
	            }
	        }
        }
        return idx;
    }
}
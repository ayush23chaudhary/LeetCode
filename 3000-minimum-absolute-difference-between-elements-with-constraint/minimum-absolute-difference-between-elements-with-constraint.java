class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> tset = new TreeSet<>();
        int n = nums.size();
        int ans = Integer.MAX_VALUE-1;
        for (int i = n -1; i >= x; i--) {
            tset.add(nums.get(i));
            int ele = nums.get(i - x);
            Integer l = tset.floor(ele);
            Integer h = tset.ceiling(ele);
            if (l != null)
                ans = Math.min(ans, ele - l);
            if (h != null)
                ans = Math.min(ans, h - ele);
        }
        return ans;
    }
}
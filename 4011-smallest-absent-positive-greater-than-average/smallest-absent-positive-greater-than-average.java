class Solution {
    public int smallestAbsent(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int avg = sum / nums.length;
        int avgNext = avg + 1;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        while (set.contains(avgNext)) {
            avgNext++;
        }

        if (avgNext <= 0) {
            avgNext = 1;
            while (set.contains(avgNext)) {
                avgNext++;
            }
        }

        return avgNext;
    }
}
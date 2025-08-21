// Last updated: 8/21/2025, 12:07:03 PM
class Solution {
    public int longestSquareStreak(int[] nums) {
        var map = new HashMap<Integer, Integer>(); 
        int res = 0;
        for (var num : nums) {
            if (map.containsKey(num)) { 
                continue;
            }

            int numDouble = 0;
            if ((long)num * num < 100001) { 
                numDouble = num * num;
            }

            int sqrt = 0;
            double tmp2 = Math.sqrt(num);
            if (tmp2 == (int)tmp2) {
                sqrt = (int)tmp2;
            }

            int count = 1;
            if (numDouble != 0) count += map.getOrDefault(numDouble,0);
            if (sqrt != 0) count += map.getOrDefault(sqrt,0);
            map.put(num, count);


            

            if (numDouble != 0 && map.containsKey(numDouble)) map.put(numDouble, count);
            if (sqrt != 0 && map.containsKey(sqrt)) map.put(sqrt, count);
            res = Math.max(res, count);
        }
        return res == 1 ? -1 : res;
    }
}
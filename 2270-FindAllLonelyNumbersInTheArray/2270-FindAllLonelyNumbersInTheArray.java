// Last updated: 8/21/2025, 12:07:32 PM
// class Solution {
//     public List<Integer> findLonely(int[] nums) {
//         Arrays.sort(nums); 
//         List<Integer> l = new ArrayList<>();

//         int n = nums.length;
//        for (int i = 0; i < n; i++) {
//             if ((i == 0 || nums[i] - nums[i - 1] > 1) && (i == n - 1 || nums[i + 1] - nums[i] > 1)) { 
//                 l.add(nums[i]);
//             }
//         }

//         return l;
//     }
// }
// //HASHMAP
class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            m.put(num,m.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (m.get(num) == 1 && !m.containsKey(num - 1) && !m.containsKey(num + 1)) {
                res.add(num);
            }
        }
        return res;
    }
}
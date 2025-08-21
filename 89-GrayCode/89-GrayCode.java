// Last updated: 8/21/2025, 12:10:59 PM
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int total = 1 << n;

        for (int i = 0; i < total; i++) {
            result.add(i ^ (i >> 1));
        }

        return result;
    }
}
// Last updated: 8/21/2025, 12:08:06 PM
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int sump, sums;
        sump = (boxes.charAt(0) == '1') ? 1 : 0;
        sums = (boxes.charAt(n - 1) == '1') ? 1 : 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + sump;
            if (boxes.charAt(i) == '1') {
                sump++; 
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + sums;
            if (boxes.charAt(i) == '1') {
                sums++; 
            }
        }
        for (int i = 0; i < n; i++) {
            prefix[i] += suffix[i];
        }

        return prefix; 
    }
}
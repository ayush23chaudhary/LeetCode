// Last updated: 8/21/2025, 12:10:11 PM
class Solution {
    public int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] isP = new boolean[n];
        Arrays.fill(isP, true);
        isP[0] = isP[1] = false;
        for (int p = 2; p * p < n; p++) {
            if (isP[p]) {
                for (int multiple = p * p; multiple < n; multiple += p) {
                    isP[multiple] = false;
                }
            }
        }
        int count = 0;
        for (boolean prime : isP) {
            if (prime)
                count++;
        }
        return count;
    }
}
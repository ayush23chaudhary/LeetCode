class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        // use array as hash table to speed up
        int[] oddFreq = new int[100001];
        int[] evenFreq = new int[100001];
        // -1 is sentinel value, meaning not found yet 
        int even1 = nums[0], even2 = -1;
        int odd1 = nums[1], odd2 = -1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                int freq = ++evenFreq[nums[i]];
                if (freq >= evenFreq[even1]) {
                    if (even1 != nums[i]) even2 = even1;
                    even1 = nums[i];
                } else if (even2 == -1 || freq > evenFreq[even2]) {
                    even2 = nums[i];
                }
            } else {
                int freq = ++oddFreq[nums[i]];
                if (freq >= oddFreq[odd1]) {
                    if (odd1 != nums[i]) odd2 = odd1;
                    odd1 = nums[i];
                } else if (odd2 == -1 || freq > oddFreq[odd2]) {
                    odd2 = nums[i];
                }
            }
        }

        
        int n0 = (n + 1) / 2, n1 = n / 2;

        int evenf2 = even2 == -1 ? 0 : evenFreq[even2];
        int oddf2 = odd2 == -1 ? 0 : oddFreq[odd2];

        if (odd1 != even1) {
            return n0 - evenFreq[even1] + n1 - oddFreq[odd1];
        } else {
            int count1 = n0 - evenFreq[even1] + n1 - oddf2;
            int count2 = n0 - evenf2 + n1 - oddFreq[odd1];
            return Math.min(count1, count2);
        }
    }
}
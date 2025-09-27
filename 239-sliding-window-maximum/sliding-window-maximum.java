class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        boolean[] invalid = new boolean[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);

        // add first k elements
        for (int i = 0; i < k; i++) {
            pq.add(i);
        }

        int[] ans = new int[n - k + 1];
        ans[0] = nums[pq.peek()];

        // process the rest
        for (int i = k; i < n; i++) {
            invalid[i - k] = true;     // mark outgoing index
            pq.add(i);               // add new index

            // remove invalid indices
            while (!pq.isEmpty() && invalid[pq.peek()]) {
                pq.poll();
            }

            ans[i - k + 1] = nums[pq.peek()];
        }

        return ans;
    }
}
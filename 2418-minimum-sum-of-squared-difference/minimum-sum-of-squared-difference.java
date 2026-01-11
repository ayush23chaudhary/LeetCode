class Solution {

    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;

        PriorityQueue<Integer> differences = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i = 0; i < n; ++i) {
            int difference = Math.abs(nums1[i] - nums2[i]);
            if (difference > 0) {
                differences.offer(Math.abs(nums1[i] - nums2[i]));
            }
        }

        int k = k1 + k2;
        while ((k > 0) && (!differences.isEmpty())) {

            int size = differences.size();

            int minK = k / size, element = differences.poll();
            int toDelete = k < size ? 1 : Math.min(minK, element);
            int toInsert = element - Math.min(toDelete, element);

            k -= toDelete;
            if (toInsert > 0) {
                differences.offer(toInsert);
            }
        }

        long answer = 0;
        while (!differences.isEmpty()) {
            long element = differences.poll();
            answer += (element * element);
        }

        return answer;
    }
}
class Solution {
    public long minimumTime(int[] arr, int T) {
        int min = arr[0];
        for (int t : arr) {
            if (t < min)
                min = t;
        }

        long lo = 1, hi = (long) min * T;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (canComplete(arr, mid, T)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private boolean canComplete(int[] arr, long mid, int T) {
        long trips = 0;
        for (int t : arr) {
            trips += mid / t;
            if (trips >= T)
                return true;
        }
        return false;
    }
}
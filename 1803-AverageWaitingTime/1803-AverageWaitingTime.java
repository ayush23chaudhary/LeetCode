// Last updated: 8/21/2025, 12:08:18 PM
class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waiting = 0;
        int current = 0;
        for (int[] a : customers) {
            if (current <= a[0]) {
                current = a[0] + a[1];
                waiting += a[1];
            } else {
                current += a[1];
                waiting += (current - a[0]);
            }
        }
        return waiting / customers.length;
    }
}

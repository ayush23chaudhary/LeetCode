class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        long res = 0;
        int n = arr.length;
        
        int[] visited = new int[n];
        for (int i = 0; i < k; i++) {
            if (visited[i] == 1) {
                continue;
            }
            int index = i;
            List<Integer> tmp = new ArrayList<>();
            while (visited[index] == 0) {
                visited[index] = 1;
                tmp.add(arr[index]);
                index = (index + k) % n;
            }
            Collections.sort(tmp);
            int mid = tmp.get(tmp.size()  / 2);
            for (int num : tmp) {
                res += Math.abs(num - mid);
            }
        }
        return res;
    }
}
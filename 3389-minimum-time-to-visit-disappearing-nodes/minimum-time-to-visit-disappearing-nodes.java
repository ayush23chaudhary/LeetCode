class Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], cost = edge[2];
            if (u == v)
                continue;
            map.get(u).put(v, Math.min(
                    map.get(u).getOrDefault(v, Integer.MAX_VALUE),
                    cost));

            map.get(v).put(u, Math.min(
                    map.get(v).getOrDefault(u, Integer.MAX_VALUE),
                    cost));
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        pq.offer(new int[] { 0, 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int node = curr[0];
            int time = curr[1];

            if (ans[node] != -1)
                continue;
            if (time >= disappear[node])
                continue;

            ans[node] = time;

            for (int nbrs : map.get(node).keySet()) {
                if (ans[nbrs] == -1) {
                    int nTime = time + map.get(node).get(nbrs);
                    if (nTime < disappear[nbrs]) {
                        pq.offer(new int[] { nbrs, nTime });
                    }
                }
            }
        }

        return ans;
    }
}
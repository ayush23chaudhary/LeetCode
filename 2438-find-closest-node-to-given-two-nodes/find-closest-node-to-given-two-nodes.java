class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        
        // Step 1: Initialize data for both explorers
        int[] dis1 = new int[n];
        int[] dis2 = new int[n];
        boolean[] vis1 = new boolean[n];
        boolean[] vis2 = new boolean[n];
        
        // Step 2: Map out the paths independently
        dfs(vis1, dis1, node1, edges);
        dfs(vis2, dis2, node2, edges);
        
        int min = Integer.MAX_VALUE;
        int ans = -1;
        
        // Step 3: Find the "fairest" meeting point (Minimize the Max distance)
        for (int i = 0; i < n; i++) {
            // A valid meeting point must be reached by both
            if (vis1[i] && vis2[i]) {
                int currentMaxDist = Math.max(dis1[i], dis2[i]);
                
                // If this node offers a better (smaller) maximum distance
                if (currentMaxDist < min) {
                    min = currentMaxDist;
                    ans = i;
                }
            }
        }
        return ans;
    }

    public void dfs(boolean[] vis, int[] dis, int node, int[] edges) {
        vis[node] = true;
        int nbr = edges[node];
        
        // Continue if there is a next node and we haven't been there yet
        if (nbr != -1 && !vis[nbr]) {
            dis[nbr] = 1 + dis[node];
            dfs(vis, dis, nbr, edges);
        }
    }
}
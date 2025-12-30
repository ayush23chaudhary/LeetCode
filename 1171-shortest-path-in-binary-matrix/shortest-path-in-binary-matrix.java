class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        // Edge case: start/end blocked
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        
        // Directions: 8 possible moves (including diagonals)
        int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        
        // BFS Queue: {row, col, path_length}
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1; // Mark as visited
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1], len = cell[2];
            
            // Reached destination
            if (r == m-1 && c == n-1) return len;
            
            // Explore all 8 directions
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 0) {
                    grid[nr][nc] = 1; // Mark visited
                    queue.offer(new int[]{nr, nc, len + 1});
                }
            }
        }
        return -1; // No path found
    }
}
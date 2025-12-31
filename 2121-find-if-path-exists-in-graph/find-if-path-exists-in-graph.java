class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create adjacency list for the graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        // Populate the graph with edges
        for(int[] arr : edges){
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        // Array to keep track of visited nodes
        boolean[] visited = new boolean[n];

        return dfs(source, destination, visited, graph);
    }

    public boolean dfs(int node, int des, boolean[] visited, List<List<Integer>>graph){
        if(node == des){
            return true;
        }

        visited[node] = true;

        // Explore neighbors
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, des, visited, graph)) {
                    return true;
                }
            }
        }
        return false;
    }
}
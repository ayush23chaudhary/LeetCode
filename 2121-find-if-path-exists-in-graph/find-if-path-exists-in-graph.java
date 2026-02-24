class Solution {
    public boolean validPath(int n, int[][] edges, int src, int des) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a= edges[i][0];
            int b= edges[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        Set<Integer> vis= new HashSet<>();
        //Ararys.fill(vis,-1);
        return BFS(src,des,vis,graph);

    }
    public boolean BFS(int src, int des,Set<Integer> vis,List<List<Integer>> graph) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while (!q.isEmpty()) {
			// 1. remove
			int r = q.poll();
			// 2. Ignore if Already visited
			if (visited.contains(r)) {
				continue;
			}
			// 3. Makred visited
			visited.add(r);
			// 4. self work
			if (r == des) {
				return true;
			}
			// 5. Add unvisited nbrs
			for (int nbrs : graph.get(r)) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}
}
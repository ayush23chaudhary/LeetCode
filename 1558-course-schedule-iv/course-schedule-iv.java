class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] queries) {
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(i, new ArrayList<>());
        }
        for(int[] arr:pre){
            graph.get(arr[0]).add(arr[1]);
        }
        List<Boolean> ans= new ArrayList<>();
        int i=0;
        for(int[] a:queries){
            ans.add(DFS(a[0],a[1],graph));
            i++;
        }
        return ans;

        
    }
    // public boolean BFS(int src, int des, List<List<Integer>> graph){
    //     Queue<Integer> q= new LinkedList<>();
    //     HashSet<Integer> visited= new HashSet<>();
    //     q.add(src);
    //     while (!q.isEmpty()) {
	// 		// 1. remove
	// 		int r = q.poll();
	// 		// 2. Ignore if Already visited
	// 		if (visited.contains(r)) {
	// 			continue;
	// 		}
	// 		// 3. Makred visited
	// 		visited.add(r);
	// 		// 4. self work
	// 		if (r == des) {
	// 			return true;
	// 		}
	// 		// 5. Add unvisited nbrs
	// 		for (int nbrs : graph.get(r)) {
	// 			if (!visited.contains(nbrs)) {
	// 				q.add(nbrs);
	// 			}
	// 		}
	// 	}
	// 	return false;
    // }
    public boolean DFS(int src, int des,List<List<Integer>> graph) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while (!st.isEmpty()) {
			// 1. remove
			int r = st.pop();
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
					st.push(nbrs);
				}
			}
		}
		return false;

	}
}
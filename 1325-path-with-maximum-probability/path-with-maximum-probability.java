class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
         // Create an adjacency list
        double[] probs = new double[n];
        probs[start_node] = 1;
        for(int i = 0; i < n - 1; i++) {//1
            boolean change = false;
            for(int j = 0; j < edges.length; j++) { // 2
                int src = edges[j][0]; //0
                int dest = edges[j][1];//2
                double prob = succProb[j];//0.2

                if(probs[src] * prob > probs[dest]) {// probs[0]*0.2 > probs[2]= 1*0.2 > 0.25 false
                    probs[dest] = probs[src] * prob;// probs[2]=0.25
                    change = true;
                }
                if(probs[dest] * prob > probs[src]) {//0.25*0.2 > 1 false
                    probs[src] = probs[dest] * prob;
                    change = true;
                }
            }
            if(change == false) break;
        }
        return probs[end_node];
    }
    }
    
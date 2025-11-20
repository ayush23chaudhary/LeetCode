class Solution {
    public int minimumArea(int[][] grid) {
        int upper=grid.length;
        int lower=0;
        int right=0;
        int left=grid[0].length;
        // upper bound
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    upper= Math.min(upper,i);
                    lower= Math.max(lower,i);
                    right= Math.max(right,j);
                    left= Math.min(left,j);

                }

            }

        }
        return (lower-upper+1)*(right-left+1);
    }
}
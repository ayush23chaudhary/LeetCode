class Solution {
    final int COL = 5;
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        char current = 'a';
        int[] pos = new int[]{0, 0};
        for(char c: target.toCharArray()){
            if(current != c){
                int[] next = get(c);
                sb.append(get(pos, next));
                current = c;
            }
            sb.append('!');
        }
        return sb.toString();
    }

    public String get(int[] pos, int[] next){
        StringBuilder sb = new StringBuilder();
        while(pos[0] > next[0]){
            pos[0]--;
            sb.append('U');            
        }            
        while(pos[1] > next[1]){
            pos[1]--;
            sb.append('L');
        }            
        while(pos[0] < next[0]){
            pos[0]++;
            sb.append('D');
        }
        while(pos[1] < next[1]){
            pos[1]++;
            sb.append('R');
        }
        return sb.toString();
    }

    public int[] get(char c){
        int idx = c - 'a';
        int row = idx / COL;
        int col = idx % COL;
        return new int[]{row, col};
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch= board[i][j];
                if(!isSafe(board,i,j,ch) && ch!='.' ){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSafe(char[][] board, int row, int col, char val) {
        // row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val && (i != col)) {
                return false;
            }
        }
        // col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val && (i != row)) {
                return false;
            }
        }
        // 3x3 dibbe 
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == val && (i != row && j != col)) {
                    return false;
                }
            }
        }
        return true;
    }
}
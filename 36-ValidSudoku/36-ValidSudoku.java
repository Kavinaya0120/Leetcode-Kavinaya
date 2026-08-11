// Last updated: 8/11/2026, 2:18:21 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];

            for(int j = 0; j < 9; j++) {

                // Row check
                if(board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if(row[num]) return false;
                    row[num] = true;
                }

                // Column check
                if(board[j][i] != '.') {
                    int num = board[j][i] - '1';
                    if(col[num]) return false;
                    col[num] = true;
                }
            }
        }

        // 3x3 box check
        for(int rs = 0; rs < 9; rs += 3) {
            for(int cs = 0; cs < 9; cs += 3) {

                boolean[] box = new boolean[9];

                for(int i = rs; i < rs + 3; i++) {
                    for(int j = cs; j < cs + 3; j++) {

                        if(board[i][j] != '.') {
                            int num = board[i][j] - '1';

                            if(box[num]) return false;
                            box[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}
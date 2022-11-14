import java.util.*;
class Solution {
    int[] board;
    int count = 0;

    public int solution (int n) {

        board = new int[n];
        backTracking(n, 0);

        return count;
    }

    public void backTracking (int n, int row){

        if(row == n){
            count += 1;
            return;
        }

        for(int i = 0; i < n; i += 1){
            board[row] = i;
            if (possible(row)) {
                backTracking(n, row + 1);
            }
        }

    }

    public boolean possible(int row){

        for(int i=0; i < row; i += 1){
            if(board[i] == board[row]){
                return false;
            }

            if (Math.abs(row-i) == Math.abs(board[row]-board[i])) {
                return false;
            }
        }
        return true;
    }
}

import backtracking.NQueenProblem;

public class TestNQueenProblem {

    public static void main(String[] args) {
        int length = 5;
        int[][] board = new int[length][length];
        for (int i=0 ; i< board.length; i++){
            for (int j=0;j<board[i].length;j++){
                board[i][j] = 0;
            }
        }
        NQueenProblem nQueenProblem = new NQueenProblem();
        nQueenProblem.solve(board,length);

    }
}

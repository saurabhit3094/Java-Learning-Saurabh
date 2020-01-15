package backtracking;

public class NQueenProblem {


    public int[][] solve(int[][] board, int length) {
        System.out.println("printing intial matrix");
        printMatrix(board);

        //place initial queen ... check from (0,0) dimension.
        placeQueen(board,0,0,length);

        System.out.println("printing solved matrix");
        printMatrix(board);

        return board;
    }

    private void placeQueen(int[][] board, int row, int column, int length) {

        if (column >= length){
            System.out.println("All queen palced successfully");
            return;
        }

        if (row >= length){
            System.out.println("Row can not be greater than length");
            return;
        }

        //try to place queen in different rows of given column.
        boolean isQueenPlacedInColumn =false;
        for (int i=row;i<length;i++){
            // if safe to place then place 1 as mark of queen
            if(checkIsSafe(board,i,column,length)){
                board[i][column]=1;
                isQueenPlacedInColumn = true;
//                System.out.println("Queen placed at dimension row : " + i + ", column : " + column);
                break;
            }else
            {
//                System.out.println("not safe to place queen at row :" + i + " column : " + column);
            }

        }

        if (isQueenPlacedInColumn) {
            placeQueen(board, 0, column+1, length);
        }else
        {
            //backtrack to previous Column and find row in column where queen is palced.
            backtrackToPreviousColumn(board,column,length);
        }

    }

    private void backtrackToPreviousColumn(int[][] board, int column, int length) {
        column--;
        int prevRow = findQueenInColumn(board,column,length);
        board[prevRow][column] = 0;
//        System.out.println("Queen removed from dimension row : " + prevRow + ", column : " + column);
        if (prevRow == length-1){
         backtrackToPreviousColumn(board,column,length);
        }else {
            placeQueen(board, prevRow + 1, column, length);
        }
    }

    private boolean checkIsSafe(int[][] board, int row, int column, int length) {

        //boundary condition

        if (row >= length || row < 0){
            return false;
        }

        if (column >= length || column < 0){
            return false;
        }

        //check left
        for (int i =column;i>=0;i--){
            if (board[row][i] == 1){
                return false;
            }
        }


        //check left lower diagonal
        int rowCopy = row;
        int columnCopy = column;
        while(rowCopy<length && columnCopy>0){
            if (board[rowCopy][columnCopy] == 1){
                return false;
            }
            rowCopy++;
            columnCopy--;
        }


        //check left upper diagonal
        rowCopy = row;
        columnCopy = column;
        while(rowCopy>0 && columnCopy>0){
            if (board[rowCopy][columnCopy] == 1){
                return false;
            }
            rowCopy--;
            columnCopy--;
        }

        return true;
    }

    private int findQueenInColumn(int[][] board, int column, int length) {
        if (column<0){
            System.out.println("This column not exist : " + column);
            return 0;
        }

        for (int i=0;i<length;i++){
            if (board[i][column] == 1){
                return i;
            }
        }

        System.out.println("Could not find queen in this column : " + column);
        return 0;
    }

    public void printMatrix(int[][] board){
        for (int i=0 ; i< board.length; i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }
}

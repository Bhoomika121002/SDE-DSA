package backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));    //for pringting the value of count use sout
    }

    static int queens(boolean[][] board, int row){
         if(row ==board.length){
             display(board);
             System.out.println();
             return 1;
         }

         //no of ways
         int count = 0;
         //placing the queen and checking foe every row & col
         for ( int col = 0; col < board.length; col++){
            //place the queen if it is safe 
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board, row +1);
                board[row][col] = false;    //when returning back change the true value to false 
            }
         }
         return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for(int i = 0; i< row; i++){
            if(board[i][col]){    //queen already there so not safe to place
                return false;
            }
        }

        //diaginal left
        int maxLeft = Math.min(row,col);
        for(int i = 1; i<= maxLeft; i++){
            if(board[row-i][col-i]){   //if it is true 
                return false; 
            }
        }
        //diagonal right
        int maxRight = Math.min(row,board.length - col -1);
        for(int i = 1; i<= maxRight; i++){
            if(board[row-i][col+i]){   //if it is true 
                return false;       //not able to place 
            }
        }

        return true; // none of checks is false means you can place it 
    }

    private static void display(boolean[][] board) {

        for(boolean[] row : board){
            for(boolean element : row){
                if(element){
                    System.out.println("Q");
                }else {
                    System.out.println("X");
                }
            }
            System.out.println();

        }
    }
      
    
}

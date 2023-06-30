package backtracking;

public class sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,7,0,0,0,0},
            {5,3,0,0,7,0,0,0,0},
            {5,3,0,0,7,0,0,0,0},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}

        };

        if(solve(board)){
            display(board);
        }else{
            System.out.println("Cannot solve");
        }}

    static boolean solve(int[][] board) {
        int n = board.length; 
        int row = -1;
        int col = -1;

        boolean emptyleft = true;

        //this is how we are replacing r,c from arguments 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;

                }
            }

            //if you found empty element then break
            if(emptyleft == false){   //means found so break out 
                break;
            }
        }
        if(emptyleft == true){    //no empty found
            return true;
            //sudoku solved 
        }

        //backtrack

        for(int number = 1; number <= 9; number++){
            if(issafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
                    //found the answer
                    
                    return true;
                } else{
                    //backtrack
                    board[row][col] = 0;
                }

            }
        }
        return false;
    }

     private static void display(int[][] board) {
        for (int[] row : board) {
            for(int num : row){
                System.out.print(num + "");
            }
            System.out.println();
        }
    }

    static boolean issafe(int[][] board, int row, int col, int num){
        //check the row
        for(int i = 0; i< board.length; i++){
            //check if the number is in the row 
            if(board[row][col] == num){    //number already present 
                return false;

            }
        }
        //check the col
        for(int[] nums : board){
            //check if the number is in the col 
            if(nums[col] == num){    //number already present 
                return false;         //same col different rows 
                
            }
        }

        //square matrix
        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = rowstart; r < rowstart +sqrt; r++){
            for(int c = colstart; c < colstart+ sqrt ; c++){
                if(board[r][c] ==num){
                    return false;
                }
            }
        }
        return true;

     }

     
}

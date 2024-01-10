class Test {
    static int count;

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        //case1: vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        //case2: diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        //case3: diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;

        /*  1: vertical up
            2: vertical down
            3: Horizonatl Right
            4: Horizontal Left
            5: Diagonal Left up
            6: Diagonal Right up
            7: Diagonal Left down
            8: Diagonal Left down
        */

    }

    public static void nQueen(char[][] board, int row) {
        if (row == board.length) { // BASE condition
            count++;
            System.out.println("-----Chess Board-----");
            printBoard(board);
            System.out.println("---------------------");
            return;
        }

        // iterate through each columns of the  row
        for (int j = 0; j < board.length; j++) {

            // check , if it is safe to place the Queen on the specific row and column.
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // place the queen if safe
                nQueen(board, row + 1); // to avoid placing the queen again in same row, incrementing row value.
                // replacing the Q with 'X' , so agian gi t will continue from where it is stoppped, beacuse safe function will not see 'Q' while checking
                // bacuseof below line, the isSafe() function will be called for each poistion in  back tracking manner, and it will check for all the possible results.
                board[row][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
        System.out.println("Num of solutions: " + count);
    }
}

class TicTacToe {

    private final int boardLength = 3;
    private final String emptyCell = " E ";
    private final String X = " X ";
    private final String O = " O "; 
    private String whoseTurn = " X ";

    private String[][] board = new String[boardLength][boardLength];

    TicTacToe() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }

        whoseTurn = X;
    }

    private void changeTurn() {
        if (whoseTurn == X) {
            whoseTurn = O;
        } else {
            whoseTurn = X;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength
            || x < 0 
            || y >= boardLength 
            || y < 0) {
                System.out.println("invalid coordinate x: " + x + "y: " + y);
            } 

        if (board[x][y] != emptyCell) {
            System.out.println("invalid move. cell not empty");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    public void printBoard() {
        System.out.println("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        board.printBoard();
        board.updateBoard(1, 1);
        board.printBoard();
        board.updateBoard(2, 1);
        board.printBoard();

    }
}
package spw4.gameConnectFour;

public class GameImpl implements Game {

    //avoid magic numbers
    private final static int HEIGHT = 6, WIDTH = 7;
    private final static char BLANK = '.';

    //Player can choose color
    private static boolean turn = true;

    int[][] board;
    //Used to track which player's turn it is for placement of the two different tokens

    public void initialize() {
        board = new int[6][7];
        for (int i=0; i < HEIGHT; i++) {
            for (int j=0; j < WIDTH; j++) {
                board[i][j] = BLANK;
            }
        }
    }

    public void placeToken(int column) {
        int i=5;
        while (board[i][column] != BLANK)
            i--;
        if (turn == true) {
            board[i][column] = 1;
            turn = false;
        } else {
            board[i][column] = 2;
            turn = true;
        }
    }

    public boolean isOver() {
        return false;
    }

    public boolean isWon() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder boardString = new StringBuilder();


        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                switch (board[i][j]) {
                    case 1:
                        boardString.append("G ");
                        break;
                    case 2:
                        boardString.append("R ");
                        break;
                    case 0:
                        boardString.append(" ");
                        break;
                }
            }

            boardString.append("\n");
        }

        return  boardString.toString();
    }

    public int getValueAt(int row, int col) {
        return board[row][col];
    }
}

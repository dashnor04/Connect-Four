package spw4.gameConnectFour;

public interface Game {
    void initialize();
    void placeToken(int column);
    boolean isOver();
    boolean isWon();
}

public interface Piece {

    PieceColor getColor();
    Square getSquare();
    void updateSquare(Square square);
    boolean isMan();
    boolean isKing();
}

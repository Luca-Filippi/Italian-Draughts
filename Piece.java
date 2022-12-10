public interface Piece {

    String getColor();
    Square getSquare();
    String getSymbol();
    void updateSquare(Square square);
}

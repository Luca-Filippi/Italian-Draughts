public class King extends Man {
  
  public King(PieceColor color, Square square) {
    super(color, square);
  }

  @Override
  public boolean isMan() {
    return false;
  }

  @Override
  public boolean isKing() {
    return true;
  }
  
}
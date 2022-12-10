import java.lang.Exception;

public class Man implements Piece {

  protected PieceColor color; // color of the piece, either black or white
  protected Square square; // current square on which the piece is positioned
  //protected SquareContent symbol

  public Man(PieceColor color, Square square) {
    try{
      if(color == null){
        throw new Exception("Color cannot be null");
      } else{
        this.color = color;
      }
      if(square.getColor().equals(SquareColor.WHITE)) {
        throw new Exception("Pieces cannot be on white squares");
      } /* else if(!square.toString().equals(this.symbol)) {
        throw new Exception("This piece cannot stand on this square");
      } */ else {
        this.square = square;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }

  @Override
  public PieceColor getColor() {
    return this.color;
  }

  @Override
  public Square getSquare() {
    return this.square;
  }

  @Override
  public void updateSquare(Square newSquare) {
    try{
      if(newSquare.getColor().equals(SquareColor.WHITE)) {
        throw new Exception("Pieces cannot be on white squares");
      } /* else if(!square.toString().equals(this.symbol)) {
        throw new Exception("This piece cannot stand on this square");
      } */ else {
        this.square = newSquare;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }

  @Override
  public boolean isMan() {
    return true;
  }

  @Override
  public boolean isKing() {
    return false;
  }
}

import java.lang.Exception;

public class Man implements Piece {

  protected PieceColor color;
  protected Square square;
  /*
   * Un oggetto di tipo Man è identificato dal colore del pezzo
   * e dalla cella in cui si trova.
   */

  public Man(PieceColor color, Square square) {
    try{
      if(color == null){
        throw new Exception("Questo colore non è valido");
      } else{
        this.color = color;
      }
      if(square.getColor().equals("white")) {
        throw new Exception("Su questa cella non può esserci una pedina");
      }
      /*
      else if(!square.toString().equals(this.type)) {
        throw new Exception("Questa pedina non deve stare su questa cella");
      }
      */
       else {
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
      if(newSquare.getColor().equals("white")) {
        throw new Exception("Su questa cella non può esserci una pedina");
      } else {
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

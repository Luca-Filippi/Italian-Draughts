import java.lang.Exception;

public class Man implements Piece {

  protected String color;
  protected Square square;
  protected String symbol;
  /*
   * Un oggetto di tipo Man è identificato dal colore del pezzo e
   * dalla cella in cui si trova. 
   * L'attributo symbol serve per differenziare il concetto di Man da King.
  */

  public Man(String color, Square square) {
    try{
      if(color.equals("white")) {
        this.color = color;
        this.symbol = "[w]";
      } else if (color.equals("black")) {
        this.color = color;
        this.symbol = "[b]";
      } else {
        throw new Exception("Questo colore non è valido");
      }
      if(square.getColor().equals("white")) {
        throw new Exception("Su questa cella non può esserci una pedina");
      } else if(!square.toString().equals(this.symbol)) {
        throw new Exception("Questa pedina non deve stare su questa cella");
      } else {
        this.square = square;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }

  public String getColor() {
    return this.color;
  }

  public Square getSquare() {
    return this.square;
  }

  public String getSymbol() {
    return this.symbol;
  }

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
}

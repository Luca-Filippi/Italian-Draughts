import java.lang.Exception;

public class Man {

  protected String color;
  protected Square square;
  protected String simbol;
  /*
   * Un oggetto di tipo Man è identificato dal colore del pezzo e
   * dalla cella in cui si trova. 
   * L'attributo simbol serve per differenziare il concetto di Man da King.
  */
  public Man() {
    /*
     * Questo costruttore vuoto serve solo per la definizione del costruttore
     * della classe King che estende Man.
    */
    color = null;
    square = null;
    simbol = null;
  }
  
  public Man(String color, Square square) {
    try{
      if(color.equals("white")) {
        this.color = color;
        this.simbol = "[w]";
      } else if (color.equals("black")) {
        this.color = color;
        this.simbol = "[b]";
      } else {
        throw new Exception("Questo colore non è valido");
      }
      if(square.getColor().equals("white") == true) {
        throw new Exception("Su questa cella non può esserci una pedina");
      } else if(square.toString().equals(this.simbol) == false) {
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

  public String getSimbol() {
    return this.simbol;
  }

  public void updateSquare(Square square) {
    try{
      if(square.getColor().equals("white") == true) {
        throw new Exception("Su questa cella non può esserci una pedina");
      } else {
        this.square = square;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }
}
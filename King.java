import java.lang.Exception;

public class King extends Man {
  
  public King(String color , Square square) {
    super();
    try{
      if(color.equals("white")) {
        this.color = color;
        this.simbol = "[W]";
      } else if (color.equals("black")) {
        this.color = color;
        this.simbol = "[B]";
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
  
}
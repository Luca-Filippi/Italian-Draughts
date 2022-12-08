import java.lang.Exception;

public class Square{
  
  private String[] possibleState = {"[ ]" , "[w]" , "[W]" , "[b]" , "[B]"};
  /* 
   * Una cella può assumere solmente 5 stati differenti:
   * libera -> [ ];
   * occupata da un white man -> [w];
   * occupata da un white King (Dama) -> [W];
   * occupata da un black man -> [b];
   * occupata da un black King -> [B];
  */
  private String state; 
  /* 
   * Attributo che rappresenta lo stato delle cella 
   */
  private char[] coordinate = new char[2]; 
  /* 
   * Attributo che rappresenta le coordinate della cella.
   * Le coordinate di una scacchiera vnno dalla cella A1,
   * fino alla cella H8.
  */
  private String color; 
  /* 
   * Attributo che rappresenta il colore della cella.
   * Il colore di una cella può essere nero o bianco.
   * Nella board vengono create 32 celle bianche e 32 celle nere,
   * ma ci si può muovere esclusivamente sulle celle nere.
  */
  
  public Square(int x, int y, String state, String color){
    try {
      switch(x) {
        case 0 :
          coordinate[0] = 'A';
          break;
        case 1 :
          coordinate[0] = 'B';
          break;
        case 2 :
          coordinate[0] = 'C';
          break;
        case 3 :
          coordinate[0] = 'D';
          break;
        case 4 :
          coordinate[0] = 'E';
          break;
        case 5 :
          coordinate[0] = 'F';
          break;
        case 6 :
          coordinate[0] = 'G';
          break;
        case 7 :
          coordinate[0] = 'H';
          break;
        default :
          throw new Exception("Coordinate non valide");
      }
      switch(y) {
        case 0 :
          coordinate[1] = '1';
          break;
        case 1 :
          coordinate[1] = '2';
          break;
        case 2 :
          coordinate[1] = '3';
          break;
        case 3 :
          coordinate[1] = '4';
          break;
        case 4 :
          coordinate[1] = '5';
          break;
        case 5 :
          coordinate[1] = '6';
          break;
        case 6 :
          coordinate[1] = '7';
          break;
        case 7 :
          coordinate[1] = '8';
          break;
        default :
          throw new Exception("Coordinate non valide");
      }
      if(color.equals("white")) {
        this.color = color;
      } else if (color.equals("black")) {
        this.color = color;
      } else {
        throw new Exception("Colore della cella non valido");
      }
      if(controlState(state) == false) {
        throw new Exception("Valore della cella non valido");
      } else {
        this.state = state;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }
  
  private boolean controlState(String state) {
    for(int i = 0; i < 5; i++) {
      if(state.equals(possibleState[i])) {
        return true;
      }
    }
    return false;
  }
  
  public String toString() {
    return this.state;
  }

  public String getCoordinateX() {
    return Character.toString(this.coordinate[0]);
  }

  public String getCoordinateY() {
    return Character.toString(this.coordinate[1]);
  }

  public String getColor() {
    return this.color;
  }
  
  public boolean isFree() {
    return state.equals("[ ]") == true ? true : false;
  }

  public void updateState(String state) {
    try {
      if(controlState(state) == false) {
        throw new Exception("Valore della cella non valido");
      } else {
        this.state = state;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }
  
}
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
  
  public Square(int x, int y, String state){
    try {
        switch (x) {
            case 0 -> coordinate[0] = 'A';
            case 1 -> coordinate[0] = 'B';
            case 2 -> coordinate[0] = 'C';
            case 3 -> coordinate[0] = 'D';
            case 4 -> coordinate[0] = 'E';
            case 5 -> coordinate[0] = 'F';
            case 6 -> coordinate[0] = 'G';
            case 7 -> coordinate[0] = 'H';
            default -> throw new Exception("Coordinate non valide");
        }
        switch (y) {
            case 0 -> coordinate[1] = '1';
            case 1 -> coordinate[1] = '2';
            case 2 -> coordinate[1] = '3';
            case 3 -> coordinate[1] = '4';
            case 4 -> coordinate[1] = '5';
            case 5 -> coordinate[1] = '6';
            case 6 -> coordinate[1] = '7';
            case 7 -> coordinate[1] = '8';
            default -> throw new Exception("Coordinate non valide");
        }

      // Assign color to square (purely based on square coordinates)
      if(x % 2 == 0){ // if x (column) even => B, D, F, H
          if(y % 2 == 0){ // if y (row) even => 2, 4, 6, 8
              this.color = "white"; //example: x=1, y=1 => square B2 => white
          } else { // if y (row) odd => 1, 3, 5, 7
              this.color = "black"; //example: x=1, y=0 => square B1 => black
          }
      } else { // if x (column) odd => A, C, E, G
          if(y % 2 == 0){ // if y (row) even => 2, 4, 6, 8
              this.color = "black"; //example: x=0, y=1 => square A2 => black
          } else { // if y (row) odd => 1, 3, 5, 7
              this.color = "white"; //example: x=0, y=0 => square A1 => white
          }
      }

      if(controlState(state)) {
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
    return state.equals("[ ]");
  }

  public void updateState(String state) {
    try {
      if(controlState(state)) {
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
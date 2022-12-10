import java.lang.Exception;

public class Square{
  
  private SquareContent state;
  /* 
   * Attributo che rappresenta lo stato delle cella 
   */
  private final char[] coordinates = new char[2];
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
  
  public Square(int x, int y, SquareContent state){
    try {
        switch (x) {
            case 0 -> coordinates[0] = 'A';
            case 1 -> coordinates[0] = 'B';
            case 2 -> coordinates[0] = 'C';
            case 3 -> coordinates[0] = 'D';
            case 4 -> coordinates[0] = 'E';
            case 5 -> coordinates[0] = 'F';
            case 6 -> coordinates[0] = 'G';
            case 7 -> coordinates[0] = 'H';
            default -> throw new Exception("Coordinate non valide");
        }
        switch (y) {
            case 0 -> coordinates[1] = '1';
            case 1 -> coordinates[1] = '2';
            case 2 -> coordinates[1] = '3';
            case 3 -> coordinates[1] = '4';
            case 4 -> coordinates[1] = '5';
            case 5 -> coordinates[1] = '6';
            case 6 -> coordinates[1] = '7';
            case 7 -> coordinates[1] = '8';
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

      if(state == null) {
        throw new Exception("Valore della cella non valido");
      } else {
        this.state = state;
      }
    } catch(Exception e) {
      System.err.println(e.getMessage());
      System.exit(-1);
    }
  }

  public String toString() {
      return this.state.toString();
  }

  public String getCoordinateX() {
    return Character.toString(this.coordinates[0]);
  }

  public String getCoordinateY() {
    return Character.toString(this.coordinates[1]);
  }

  public String getColor() {
    return this.color;
  }
  
  public boolean isFree() {
    return state.equals(SquareContent.EMPTY);
  }

  public void updateState(SquareContent state) {
    try {
      if(state == null) {
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

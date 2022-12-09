public class King extends Man {
  
  public King(String color, Square square) {
    super(color, square);
    this.symbol = this.symbol.toUpperCase();
  }
  
}
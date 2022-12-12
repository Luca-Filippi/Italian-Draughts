public enum LastRow {
  WHITE("H"),
  BLACK("A"),
  EMPTY(" ");

  private final String coordinate;

  LastRow(String coordinate){
    this.coordinate = coordinate;
  }

  @Override
  public String toString() {
    return coordinate;
  }
  
}
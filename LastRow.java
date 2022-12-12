public enum LastRow {
  WHITE("H"),
  BLACK("A");

  private final String coordinate;

  LastRow(String coordinate){
    this.coordinate = coordinate;
  }

  @Override
  public String toString() {
    return coordinate;
  }
  
}

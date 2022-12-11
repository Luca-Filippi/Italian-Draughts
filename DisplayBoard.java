public class DisplayBoard {

    /*
    - consider an interface for decoupling
    - not necessarily a static class
     */
    public static void displayBoardForWhitePlayer(Square[][] boardSquares) {
        for(byte i=7; i>=0; i--){
            for(byte j=0; j<8; j++){
                //System.out.print("{"+i+","+j+"}" + boardSquares[i][j].toString() + boardSquares[i][j].getColor().toString() + "\t");
                System.out.print(boardSquares[i][j].toString());
            }
            System.out.println();
        }
    }

    public static void displayBoardForBlackPlayer(Square[][] boardSquares) {
        for(byte i=0; i<8; i++){
            for(byte j=7; j>=0; j--){
                //System.out.print("{"+i+","+j+"}" + boardSquares[i][j].toString() + boardSquares[i][j].getColor().toString() + "\t");
                System.out.print(boardSquares[i][j].toString());
            }
            System.out.println();
        }
    }

}

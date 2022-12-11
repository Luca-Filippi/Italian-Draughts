public class Board {

    private Square[][] boardSquares;

    public Board(){
        boardSquares = new Square[8][8];
        for(byte i=0; i<8; i++){
            for(byte j=0; j<8; j++){
                boardSquares[i][j] = new Square(i, j, SquareContent.EMPTY);
            }
            System.out.println();
        }
        initBoard();
    }

    private void initBoard(){
        // add White initial pieces (rows 1, 2, 3)
        for(byte i=0; i<3; i++){
            for(byte j=0; j<8; j+=2){
                if(i % 2 == 0 && j == 0){
                    j--;
                    continue;
                }
                this.boardSquares[i][j].updateState(SquareContent.WHITE_MAN);
            }
        }
        // add Black initial pieces (rows 6, 7, 8)
        for(byte i=5; i<8; i++){
            for(byte j=0; j<8; j+=2){
                if(i % 2 == 0 && j == 0){
                    j--;
                    continue;
                }
                this.boardSquares[i][j].updateState(SquareContent.BLACK_MAN);
            }
            System.out.println();
        }
    }

    public Square[][] getBoardSquares() {
        return boardSquares;
    }

    public static void main(String[] args) { // temporary test purpose
        Board b = new Board();
        System.out.println("White Player turn: ");
        DisplayBoard.displayBoardForWhitePlayer(b.getBoardSquares());
        System.out.println();
        System.out.println("Black Player turn: ");
        DisplayBoard.displayBoardForBlackPlayer(b.getBoardSquares());
    }
}

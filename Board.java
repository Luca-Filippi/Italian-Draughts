public class Board {

    private Square[][] board;

    public Board(){
        board = new Square[8][8];
        for(byte i=0; i<8; i++){
            for(byte j=0; j<8; j++){
                board[i][j] = new Square(i, j, SquareContent.EMPTY);
            }
            System.out.println();
        }
        initBoard();
        displayBoard();
    }

    private void initBoard(){
        for(byte i=0; i<3; i++){
            for(byte j=0; j<8; j+=2){
                if(i % 2 == 0 && j == 0){
                    j--;
                    continue;
                }
                this.board[i][j].updateState(SquareContent.WHITE_MAN);
            }
        }
        for(byte i=5; i<8; i++){
            for(byte j=0; j<8; j+=2){
                if(i % 2 == 0 && j == 0){
                    j--;
                    continue;
                }
                this.board[i][j].updateState(SquareContent.BLACK_MAN);
            }
            System.out.println();
        }
    }

    private void displayBoard(){
        for(byte i=7; i>=0; i--){
            for(byte j=0; j<8; j++){
                System.out.print("{"+i+","+j+"}" + board[i][j].toString() + board[i][j].getColor().toString() + "\t");
                //System.out.print(board[i][j].toString());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board b = new Board();
    }
}

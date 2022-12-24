package it.units.inginf.italiandraughts;

//import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        Board board = new Board();
        Square[][] boardSquares = board.getBoardSquares();
        King king = new King(PieceColor.BLACK, boardSquares[2][5]);
        List<Square> squareList = board.getReachableSquares(king);
        System.out.println(boardSquares[2][5].getCoordinateX() + boardSquares[2][5].getCoordinateY());
        System.out.println("-----");
        for(Square square: squareList) {
            System.out.println(square.getCoordinateX() + square.getCoordinateY());
        }
        /*Game game = new Game();
        game.changeTurn();
        System.out.println(game.checkVictoryCondition());
        System.out.println(game.getBoard().getDisplayBoardForWhitePlayer());
        System.out.println(game.getTurnCounter());*/
    }
}

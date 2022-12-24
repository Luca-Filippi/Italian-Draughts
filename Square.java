package it.units.inginf.italiandraughts;

public class Square {

    private final char[] coordinates = new char[2]; //coordinates of the cell ( from A1 to H8)
    private final SquareColor squareColor; // square color (black or white)
    // italian-draughts pieces are only allowed on black squares
    private SquareContent squareContent;

    private final int matrixCoordinateX;
    private final int matrixCoordinateY;


    public Square(int x, int y) throws Exception {
        switch (x) {
            case 0:
                coordinates[0] = 'A';
                break;
            case 1:
                coordinates[0] = 'B';
                break;
            case 2:
                coordinates[0] = 'C';
                break;
            case 3:
                coordinates[0] = 'D';
                break;
            case 4:
                coordinates[0] = 'E';
                break;
            case 5:
                coordinates[0] = 'F';
                break;
            case 6:
                coordinates[0] = 'G';
                break;
            case 7:
                coordinates[0] = 'H';
                break;
            default:
                throw new Exception("Coordinates accepted value are integers from 0 to 7 included");
        }
        switch (y) {
            case 0:
                coordinates[1] = '1';
                break;
            case 1:
                coordinates[1] = '2';
                break;
            case 2:
                coordinates[1] = '3';
                break;
            case 3:
                coordinates[1] = '4';
                break;
            case 4:
                coordinates[1] = '5';
                break;
            case 5:
                coordinates[1] = '6';
                break;
            case 6:
                coordinates[1] = '7';
                break;
            case 7:
                coordinates[1] = '8';
                break;
            default:
                throw new Exception("Coordinates accepted value are integers from 0 to 7 included");
        }

        matrixCoordinateX = x;
        matrixCoordinateY = y;

        // Assign color to square (purely based on square coordinates)
        if(x % 2 == 0){ // if x (column) even => B, D, F, H
            if(y % 2 == 0){ // if y (row) even => 2, 4, 6, 8
                this.squareColor = SquareColor.WHITE; //example: x=1, y=1 => square B2 => white
            } else { // if y (row) odd => 1, 3, 5, 7
                this.squareColor = SquareColor.BLACK; //example: x=1, y=0 => square B1 => black
            }
        } else { // if x (column) odd => A, C, E, G
            if(y % 2 == 0){ // if y (row) even
                this.squareColor = SquareColor.BLACK; //example: x=0, y=1 => square A2 => black
            } else { // if y (row) odd
                this.squareColor = SquareColor.WHITE; //example: x=0, y=0 => square A1 => white
            }
        }

        this.squareContent = SquareContent.EMPTY;
    }

    public int getMatrixCoordinateX(){
        return this.matrixCoordinateX;
    }
    public int getMatrixCoordinateY(){
        return this.matrixCoordinateY;
    }

    public String getCoordinateX() { // columns: A, B, ..., H
        return Character.toString(this.coordinates[0]);
    }

    public String getCoordinateY() { // rows: 1, 2, ... 8
        return Character.toString(this.coordinates[1]);
    }

    public SquareColor getSquareColor() {
        return this.squareColor;
    }

    public SquareContent getSquareContent() {
        return squareContent;
    }

    public void setSquareContent (SquareContent newSquareContent) throws Exception {
        if (newSquareContent == null) {
            throw new Exception("Square content cannot be null");
        } else {
            this.squareContent = newSquareContent;
        }
    }

    public boolean isFree() {
        return squareContent.equals(SquareContent.EMPTY);
    }

}

public class Bishop extends Piece {

    int row = 1;
    int column = 5;


    @Override
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            if (Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


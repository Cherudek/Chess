public class Queen extends Piece {

    int row = 2;
    int column = 1;

    @Override
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            if (((newPosition.column == this.column || newPosition.row == this.row)) ||
                ((Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)))){
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}

public class Rock extends Piece {

    int row = 2;
    int column = 1;

    @Override
    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition)) {
            if (newPosition.column == this.column || newPosition.row == this.row) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}


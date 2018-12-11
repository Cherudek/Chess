public class Main {

    public static void main(String[] args) {

        Queen queen = new Queen();
        Position newPosition = new Position(4, 3);
        if(queen.isValidMove(newPosition)) {
            System.out.println("Queen Yes, You can move there.");
        } else {
            System.out.println("Queen Nope, You can't do!");
        }

        Rock rock = new Rock();
        Position rockNewPosition = new Position(2, 7);
        if(rock.isValidMove(rockNewPosition)) {
            System.out.println("Rock Yes, You can move there.");
        } else {
            System.out.println("Rock Nope, You can't do!");
        }

        Bishop bishop = new Bishop();
        Position bishopNewPosition = new Position(3, 7);
        if(bishop.isValidMove(bishopNewPosition)) {
            System.out.println("Bishop Yes, You can move there.");
        } else {
            System.out.println("Bishop Nope, you can't do!");
        }

    }
}

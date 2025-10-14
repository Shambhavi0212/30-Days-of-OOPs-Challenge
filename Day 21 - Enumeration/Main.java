
enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class Main {

    public static void main(String[] args) {
        Direction dir = Direction.EAST;

        switch (dir) {
            case NORTH ->
                System.out.println("Moving up");
            case SOUTH ->
                System.out.println("Moving down");
            case EAST ->
                System.out.println("Moving right");
            case WEST ->
                System.out.println("Moving left");
        }
    }
}

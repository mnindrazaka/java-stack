public class Game {
    private final CoordinateHistory coordinateHistory;
    private final int maxX;
    private final int maxY;

    public Game(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.coordinateHistory = new CoordinateHistory(100);
        Coordinate coordinate = new Coordinate(0, 0);
        this.coordinateHistory.push(coordinate);
    }

    public CoordinateHistory getCoordinateHistory() {
        return coordinateHistory;
    }

    private void move(int x, int y) {
        Coordinate prevCoordinate = coordinateHistory.getCoordinate();
        Coordinate nextCoordinate = new Coordinate(prevCoordinate.getX() + x, prevCoordinate.getY() + y);
        if (nextCoordinate.getX() >= 0 && nextCoordinate.getX() <= maxX && nextCoordinate.getY() >= 0 && nextCoordinate.getY() <= maxY) {
            coordinateHistory.push(nextCoordinate);
        }
    }

    public void moveUp() {
        move(0, -1);
    }

    public void moveDown() {
        move(0, 1);
    }

    public void moveLeft() {
        move(-1, 0);
    }

    public void moveRight() {
        move(1, 0);
    }

    public void undoMove() {
        coordinateHistory.undo();
    }
}

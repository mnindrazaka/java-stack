public class CoordinateHistory extends Stack<Coordinate> {
    CoordinateHistory(int size) {
        super(Coordinate.class, size);
    }

    public Coordinate getCoordinate() {
        return super.getItem();
    }

    public void push(Coordinate coordinate) {
        super.push(coordinate);
    }

    public void undo() {
        super.pop();
    }
}

package interfaceExample;

public interface Movable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses
    // "public" and "abstract" by default
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();

}

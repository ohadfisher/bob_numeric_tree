package bob.tree.model;

public abstract class Node {
    protected Node nodeLeft;
    protected Node nodeRight;

    abstract public double getVal();
}

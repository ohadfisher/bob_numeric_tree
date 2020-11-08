package bob.tree.model;

public class NodeNumeric extends Node {
    private double value;

    public NodeNumeric(double value) {
        this.value = value;
    }

    @Override
    public double getVal() {
        return value;
    }
}

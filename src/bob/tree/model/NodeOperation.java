package bob.tree.model;

public class NodeOperation extends Node {
    private Operator operator;

    public NodeOperation(Operator operator, Node nodeLeft, Node nodeRight) {
        this.operator = operator;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
    }

    public double getVal() {
        return operator.calculate(nodeLeft.getVal(), nodeRight.getVal());
    }
}

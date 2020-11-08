package bob.tree;


import bob.tree.model.Node;
import bob.tree.model.NodeNumeric;
import bob.tree.model.NodeOperation;
import bob.tree.service.Operators;

public class RunMe {
    public static void main(String[] args) {

        Node node_2 = new NodeNumeric(2);
        Node node_8 = new NodeNumeric(8);
        Node plus_8_2 = new NodeOperation(Operators.plus, node_8, node_2);
        Node node_5 = new NodeNumeric(5);
        Node minus_8Plus2_5 = new NodeOperation(Operators.minus, plus_8_2, node_5);
        Node node_4 = new NodeNumeric(4);
        Node multiply_4_8Plus2Minus5 = new NodeOperation(Operators.multiply, node_4, minus_8Plus2_5);

        System.out.println("Numeric (expected 2) :\t\t\t\t\t  "
                + calcTreeValue(node_2));
        System.out.println("Numeric (expected 4) :\t\t\t\t\t  "
                + calcTreeValue(node_4));
        System.out.println("Numeric (expected 5) :\t\t\t\t\t  "
                + calcTreeValue(node_5));
        System.out.println("Numeric (expected 8) :\t\t\t\t\t  "
                + calcTreeValue(node_8));


        System.out.println("8 + 2=  (expected 10):\t\t\t\t\t "
                + calcTreeValue(plus_8_2));

        System.out.println("8+2-5=  (expected 5) : \t\t\t\t\t  "
                + calcTreeValue(minus_8Plus2_5));

        System.out.println("Tree value 4*(8+2-5)=  (expected 20) is: "
                + calcTreeValue(multiply_4_8Plus2Minus5));
    }

    public static double calcTreeValue(Node treeHead) {
        return treeHead.getVal();
    }
}


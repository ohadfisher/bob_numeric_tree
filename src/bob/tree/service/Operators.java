package bob.tree.service;

import bob.tree.model.Operator;

public class Operators {
    public static final Operator divide = (left, right) -> left / right;
    public static final Operator multiply = (left, right) -> left * right;
    public static final Operator plus = (left, right) -> left + right;
    public static final Operator minus = (left, right) -> left - right;

}


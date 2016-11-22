import com.javaunivercity.evgenii.operations.BinaryOperation;

/**
 * Class for binary operators
 */
public class BinaryOperator {
    final int leftArgument;
    final int rightArgument;
    final BinaryOperation operation;

    public BinaryOperator(int leftArgument, int rightArgument, BinaryOperation operation) {
        this.leftArgument = leftArgument;
        this.rightArgument = rightArgument;
        this.operation = operation;
    }

    public int operate() {
        return operation.calculate(leftArgument,rightArgument);
    }

    public String toString() {
        return "l:" + leftArgument + " r:" + rightArgument + " o:" + operation;
    }

}

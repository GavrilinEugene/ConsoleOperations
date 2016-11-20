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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Operator operator = (Operator) o;
//
//        if (leftArgument != operator.leftArgument) return false;
//        if (rightArgument != operator.rightArgument) return false;
//        return operation == operator.operation;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = leftArgument;
//        result = 31 * result + rightArgument;
//        result = 31 * result + operation.hashCode();
//        return result;
//    }
}

import org.apache.commons.cli.CommandLine;
import com.javaunivercity.evgenii.operations.*;

/**
 * Simple converter that get arguments from command line
 * and create operation
 */
public class CommandLineToOperatorConverter {
    public static BinaryOperator convert(CommandLine line) {
        int leftArgument = Integer.parseInt(line.getOptionValue("left"));
        int rightArgument = Integer.parseInt(line.getOptionValue("right"));

        BinaryOperation operation = null;
        String operationName = line.getOptionValue("operation");
        switch (operationName) {
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
        }

        if (operation == null)
            return null;
        return new BinaryOperator(leftArgument, rightArgument, operation);
    }
}

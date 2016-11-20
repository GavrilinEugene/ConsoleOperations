import org.apache.commons.cli.*;

/**
 * Main task
 */
public class App {
    public static void main(String args[]) {
        Parser parser = new BinaryOperationParser();
        try {
            CommandLine commandLine = parser.parse(args);
            BinaryOperator operator = CommandLineToOperatorConverter.convert(commandLine);
            System.out.print(operator.operate());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

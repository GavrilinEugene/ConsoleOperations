import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/**
 * cmd format options parser
 */
public class BinaryOperationParser extends Parser {
    public BinaryOperationParser() {
        options = new Options();

        Option leftOperand = Option.builder("l")
                .required(true)
                .longOpt("left")
                .hasArg()
                .desc("left operand")
                .build();

        Option rightOperand = Option.builder("r")
                .required(true)
                .longOpt("right")
                .hasArg()
                .desc("right operand")
                .build();

        Option operation = Option.builder("o")
                .required(true)
                .longOpt("operation")
                .hasArg()
                .desc("binary operation:\n" +
                        "+ add\n" +
                        "* mult\n" +
                        "- sub\n" +
                        "/ div\n")
                .build();

        options.addOption(leftOperand);
        options.addOption(rightOperand);
        options.addOption(operation);
    }
}

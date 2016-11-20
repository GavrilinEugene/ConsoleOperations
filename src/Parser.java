import org.apache.commons.cli.*;

/**
 * Class-parent for all format classes
 */
public class Parser {
    Options options;

    public CommandLine parse(String args[]) throws ParseException {
        CommandLineParser parser = new DefaultParser();
        CommandLine line = parser.parse(options, args);

        return line;
    }
}

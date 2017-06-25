import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.ParseException;
import org.junit.Test;

/**
 * parser test bad inputs
 */
public class BinaryOperationParserTest {
    @Test(expected = MissingArgumentException.class)
    public void parseMissingArgument() throws ParseException {
        String args[] = {"-l", "-r", "57", "-o", "*"};
        Parser parser = new BinaryOperationParser();
        parser.parse(args);
    }

    @Test(expected = MissingOptionException.class)
    public void parseMissingOption() throws ParseException {
        String args[] = {"3", "-r", "1", "-o", "-"};
        Parser parser = new BinaryOperationParser();
        parser.parse(args);
    }

}
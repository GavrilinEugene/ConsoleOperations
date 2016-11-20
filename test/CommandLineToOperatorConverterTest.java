import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingArgumentException;
import com.javaunivercity.evgenii.operations.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for converter
 */
public class CommandLineToOperatorConverterTest {
    @Test
    public void convert() throws Exception {
        String args[] = {"-l", "90", "-r", "6", "-o", "+"};
        CommandLine line = new BinaryOperationParser().parse(args);
        assertEquals(96, new CommandLineToOperatorConverter().convert(line).operate());

        args = new String[]{"-r", "5", "-l", "-8", "-o", "*"};
        line = new BinaryOperationParser().parse(args);
        assertEquals(-40, new CommandLineToOperatorConverter().convert(line).operate());
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertWithBadOperator() throws Exception {
        String args[] = {"-l", "5", "-r", "6", "-o", "something_bad"};
        CommandLine line = new BinaryOperationParser().parse(args);
        BinaryOperator expected = new BinaryOperator(5, 6, new Addition());
        new CommandLineToOperatorConverter().convert(line);
    }

}
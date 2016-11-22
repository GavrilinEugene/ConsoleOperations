import org.apache.commons.cli.CommandLine;
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

}
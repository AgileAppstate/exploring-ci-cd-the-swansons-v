import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

public class HelloWorldTest {

    @Test
    void testMainOutput() {
        // Capture system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        HelloWorld.main(new String[]{});

        // Restore normal System.out
        System.setOut(originalOut);

        // Compare output
        String output = outContent.toString().trim();
        LocalDate obj = LocalDate.now();
        assertEquals("Hello World!\n" + obj, output);
    }
}



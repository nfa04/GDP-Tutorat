package printer;

// Entfernen Sie /* und */, sobald Sie Printer, StarPrinter, QuestionPrinter und Main.printingChoice implementiert haben.
/*
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import static org.junit.Assert.*;

public class PrinterTests {

    private String captureOutput(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(baos, true, StandardCharsets.UTF_8));
            action.run();
        } finally {
            System.setOut(originalOut);
        }
        return baos.toString(StandardCharsets.UTF_8).trim();
    }

    @Test
    public void testStarPrinter() {
        Printer p = new StarPrinter();
        assertEquals("*Hallo*", captureOutput(() -> p.print("Hallo")));
    }

    @Test
    public void testQuestionPrinter() {
        Printer p = new QuestionPrinter();
        assertEquals("Java?", captureOutput(() -> p.print("Java")));
    }

    @Test
    public void testPrintingChoice() {
        assertEquals("*Test*", captureOutput(() -> Main.printingChoice("Test", new StarPrinter())));
        assertEquals("Test?", captureOutput(() -> Main.printingChoice("Test", new QuestionPrinter())));
    }

    @Test
    public void testPrintingChoiceBeliebigerPrinter() {
        Printer custom = new Printer() {
            @Override
            public void print(String s) {
                System.out.println("[" + s + "]");
            }
        };
        assertEquals("[Uni]", captureOutput(() -> Main.printingChoice("Uni", custom)));
    }
}
*/

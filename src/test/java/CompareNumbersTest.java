import org.example.Lesson_12.CompareNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareNumbersTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCompareGreater() {
        CompareNumber num1 = new CompareNumber(30);
        CompareNumber num2 = new CompareNumber(20);
        num1.compare(num2);
        assertEquals("30 больше, чем 20\n", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCompareLesser() {
        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(20);
        num1.compare(num2);
        assertEquals("10 меньше, чем 20\n", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCompareEqual() {
        CompareNumber num1 = new CompareNumber(15);
        CompareNumber num2 = new CompareNumber(15);
        num1.compare(num2);
        assertEquals("15 равно 15\n", outputStreamCaptor.toString().trim());
    }
}
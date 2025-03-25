import org.example.Lesson_12.CompareNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CompareNumberTest {


    @Test
    @DisplayName("тест для программы сравнивающей два целых числа")

    public void someTest() {
        System.out.println(" тест запустился ");
    }

    @Test
    void testCompareGreater() {
        CompareNumber num1 = new CompareNumber(20);
        CompareNumber num2 = new CompareNumber(10);


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();// перенаправление вывода
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        assertEquals("20 больше, чем 10\n", outContent.toString());
    }

    @Test
    void testCompareLesser() {
        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(20);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        assertEquals("10 меньше, чем 20\n", outContent.toString());
    }

    @Test
    void testCompareEqual() {
        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(10);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        assertEquals("10 равно 10\n", outContent.toString());
    }

}

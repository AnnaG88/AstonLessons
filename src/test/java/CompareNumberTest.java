import org.example.Lesson_12.CompareNumber;
import org.testng.annotations.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.testng.Assert.*;

public class CompareNumberTest {

    @Test(description = "тест для программы сравнивающей два целых числа")

    public void someTest() {
        System.out.println(" тест запустился");
    }
    @Test
    public void testCompareGreater() {
        CompareNumber num1 = new CompareNumber(30);
        CompareNumber num2 = new CompareNumber(20);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // захвата вывода
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        String expectedOutput = "30 больше, чем 20\n";
        assertEquals(outContent.toString(), expectedOutput);

        System.setOut(System.out); // вернуть как было
    }

    @Test
    public void testCompareLess() {
        CompareNumber num1 = new CompareNumber(10);
        CompareNumber num2 = new CompareNumber(20);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        String expectedOutput = "10 меньше, чем 20\n";
        assertEquals(outContent.toString(), expectedOutput);

        System.setOut(System.out);
    }

    @Test
    public void testCompareEqual() {
        CompareNumber num1 = new CompareNumber(15);
        CompareNumber num2 = new CompareNumber(15);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        num1.compare(num2);

        String expectedOutput = "15 равно 15\n";
        assertEquals(outContent.toString(), expectedOutput);

        System.setOut(System.out);
    }
}
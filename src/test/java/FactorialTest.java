import org.example.Lesson_12.Factorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    // private final Factorial factorial = new Factorial();
    private final Factorial factorialCalculator = new Factorial();


    @DisplayName("тест для программы вычисления факториала")
    @Test
    public void someTest() {
        System.out.println(" тест запустился ");
    }

    @Test
    public void testFactorialOfZero() {
        String result = factorialCalculator.factorial(0);
        assertEquals("факториал 0 равен 1", result);
    }

    @Test
    public void testFactorialOfOne() {
        String result = factorialCalculator.factorial(1);
        assertEquals("факториал 1 равен 1", result);
    }

    @Test
    public void testFactorialOfTwo() {
        String result = factorialCalculator.factorial(2);
        assertEquals("факториал 2 равен 2", result);
    }

    @Test
    public void testFactorialOfThree() {
        String result = factorialCalculator.factorial(3);
        assertEquals("факториал 3 равен 6", result);
    }

    @Test
    public void testFactorialOfFour() {
        String result = factorialCalculator.factorial(4);
        assertEquals("факториал 4 равен 24", result);
    }

    @Test
    public void testFactorialOfFive() {
        String result = factorialCalculator.factorial(5);
        assertEquals("факториал 5 равен 120", result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        String result = factorialCalculator.factorial(-1);
        assertEquals("для отрицательного -1 факториала не бывает", result);
    }
}

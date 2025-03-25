import org.example.Lesson_12.ArithmeticOperation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationTest {

    @Test
    @DisplayName("тест для программы вычисления арифметических операций")

    public void someTest() {
        System.out.println(" тест запустился ");
    }

    @Test
    void testSumma() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        assertEquals(15, operation.summa());
    }

    @Test
    void testSubtraction() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        assertEquals(5, operation.subtraction());
    }

    @Test
    void testMultiplication() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        assertEquals(50, operation.multiplication());
    }

    @Test
    void testDivision() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        assertEquals(2.0, operation.division());
    }

    @Test
    void testDivisionByZero() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 0);
        assertThrows(ArithmeticException.class, operation::division);
    }

}

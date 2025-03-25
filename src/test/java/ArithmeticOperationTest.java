import org.example.Lesson_12.ArithmeticOperation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationTest {

    @Test(description = "тест для программы вычисления арифметических операций")

    public void someTest() {
        System.out.println(" тест запустился");
    }

    @Test
    public void testSumma() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        Assert.assertEquals(operation.summa(), 15, "Сложение не работает правильно");
    }

    @Test
    public void testSubtraction() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        Assert.assertEquals(operation.subtraction(), 5, "Вычитание не работает правильно");
    }

    @Test
    public void testMultiplication() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        Assert.assertEquals(operation.multiplication(), 50, "Умножение не работает правильно");
    }

    @Test
    public void testDivision() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 5);
        Assert.assertEquals(operation.division(), 2.0, "Деление не работает правильно");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        ArithmeticOperation operation = new ArithmeticOperation(10, 0);
        operation.division(); // выбросить исключение
    }
}
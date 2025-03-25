import org.example.Lesson_12.Factorial;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FactorialTest {

    @Test(description = "тест для программы вычисления факториала")

    public void someTest() {
        System.out.println(" тест запустился");
    }

    private final Factorial factorialCalculator = new Factorial();

    @DataProvider(name = "factorialDataProvider")
    public Object[][] factorialDataProvider() {
        return new Object[][]{
                {0, 1},   // факториал 0 = 1
                {1, 1},   // ... и
                {2, 2},   // ... т.д.
                {3, 6},   // ...
                {4, 24},  // ...
                {5, 120}, // ...
                {-1, -1}  // ошибка
        };
    }

    @Test(dataProvider = "factorialDataProvider")
    public void testFactorial(int input, long expected) {
        if (input < 0) {
            try {
                factorialCalculator.factorial(input);
                Assert.fail("смс об ошибке для отриц. числа: " + input);
            } catch (Exception e) {
                Assert.assertTrue(e.getMessage().contains("факториала не бывает"));
            }
        } else {
            long result = factorialCalculator.calculateFactorial(input);
            Assert.assertEquals(result, expected, "факториал " + input + " должен быть равен " + expected);
        }
    }
}
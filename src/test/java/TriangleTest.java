import org.example.Lesson_12.Triangle;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TriangleTest {

    @Test(description = "тест для программы вычисления площади треугольника")

    public void someTest() {
        System.out.println(" тест запустился");
    }

    @Test
    public void testAreaWithValidTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expectedArea = 6.0;
        Assert.assertEquals(triangle.area(), expectedArea, 0.0001);
    }

    @Test
    public void testAreaWithAnotherValidTriangle() {
        Triangle triangle = new Triangle(6, 8, 10);
        double expectedArea = 24.0;
        Assert.assertEquals(triangle.area(), expectedArea, 0.0001);
    }

    @Test
    public void testAreaWithEquilateralTriangle() {
        Triangle triangle = new Triangle(2, 2, 2);
        double expectedArea = Math.sqrt(3);
        Assert.assertEquals(triangle.area(), expectedArea, 0.0001);
    }

    @Test
    public void testAreaWithDegenerateTriangle() {
        Triangle triangle = new Triangle(1, 1, 2);
        double expectedArea = 0.0;
        Assert.assertEquals(triangle.area(), expectedArea, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithInvalidTriangle() {
        Triangle triangle = new Triangle(1, 2, 3);
        triangle.area();
    }
}
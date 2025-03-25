import org.example.Lesson_12.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {


    @Test
    @DisplayName("тест для программы вычисления площади треугольника")

    public void someTest() {
        System.out.println(" тест запустился ");
    }

    @Test
    public void triangleTest() {
        Triangle triangle1 = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle1.area(), 0.0001, "S треугольника 3, 4, 5 = 6.0");

        Triangle triangle2 = new Triangle(5, 12, 13);
        assertEquals(30.0, triangle2.area(), 0.0001, "S треугольника 5, 12, 13 = 30.0");

        Triangle triangle3 = new Triangle(7, 8, 9);
        assertEquals(26.8328, triangle3.area(), 0.0001, "S треугольника 7, 8, 9 = 26.8328");
    }

}

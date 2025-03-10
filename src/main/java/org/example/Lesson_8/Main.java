package org.example.Lesson_8;

/* № 1. Напишите метод на вход которого подается двумерный строковый
массив размером 4х4. При подаче массива другого размера необходимо
бросить исключение MyArraySizeException.

№ 2. Далее метод должен пройтись по всем элементом массива,
преобразовать в int и просуммировать. Если в каком-то элементе
массива преобразование не удалось (например, в ячейке лежит символ
или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат
неверные данные.

№ 3. В методе main() вызвать полученный метод, обработать возможные
исключения MyArraySizeException и MyArrayDataException и вывести
результ расчета.

№ 4. Напишите код для генерации и поимки ArrayIndexOutOfBoundsException.
 */

public class Main {

    // Метод для анализа массива
    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) { // Проверяем размер массива
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) { // Проходим по элементам массива
            for (int j = 0; j < array[i].length; j++) {
                try { // Преобразуем строковый элемент в целое число и добавляем к сумме
                    sum += Integer.parseInt(array[i][j]);
                } catch (IllegalArgumentException e) {
                    String message = "в " + String.valueOf(i) + " ряду, " + String.valueOf(j) + " ячейке";
                    // Если преобразование не удалось, бросаем исключение MyArrayDataException
                    throw new MyArrayDataException(message);
                }
            }
        }
        return sum; // Возвращаем сумму элементов массива
    }

    public static void main(String[] args) {

        String[][] array1 = {          // корректный массив
                {"10", "5", "7", "8"},
                {"10", "5", "7", "8"},
                {"10", "5", "7", "8"},
                {"10", "5", "7", "8"}};

        String[][] array2 = {          // массив с некорректными данными
                {"10", "5", "7", "8"},
                {"10", "5", "7", "8"},
                {"10", "5", "7", "8"},
                {"ccc", "5", "7", "8"}};

        String[][] array3 = {          // массив неправильного размера
                {"5", "7", "8"},
                {"5", "7", "8"},
                {"5", "7", "8"},
                {"5", "7", "8"}};

        System.out.println("Случай корректного массива:");
        int result = 0;
        try {
            result = 0;
            result = analyze(array1);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива " + String.valueOf(result));
        }

        System.out.println("Случай некорректных данных:");
        try {
            result = 0;
            result = analyze(array2);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива " + String.valueOf(result));
        }

        System.out.println("Случай некорректного массива:");
        try {
            result = 0;
            result = analyze(array3);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива " + String.valueOf(result));
        }

        // код для генерации и поимки ArrayIndexOutOfBoundsException
        int[] array4 = {6, 5, 10};
        try {
            int value = array4[7];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка ArrayIndexOutOfBoundsException");
        }
    }
}
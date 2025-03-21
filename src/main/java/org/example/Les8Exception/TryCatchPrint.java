package org.example.Les8Exception;

public class TryCatchPrint {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a / b);  // ошибку полученную в try...
            System.out.println("какая то операция");
        }
        catch (ArithmeticException e) {  // ...сравниваем с исключениями
            e.printStackTrace(); // вывести информацию об ошибке
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); // вывести информацию об ошибке
        }
        catch (AbstractMethodError | AssertionError e) { // мульти катч
            e.printStackTrace(); // вывести информацию об ошибке
        }
        finally {
            System.out.println("блок выполнится всегда");
        }
        System.out.println("какой то текст");
    }
}

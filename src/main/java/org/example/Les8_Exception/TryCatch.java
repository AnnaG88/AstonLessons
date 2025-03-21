package org.example.Les8_Exception;

public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a / b);  // ошибку полученную в try...
            System.out.println("какая то операция");
        }
        catch (ArithmeticException e) {
            System.out.println("отработало исключение");  // ...сравниваем с исключениями
        }
        System.out.println("какой то текст");
    }
}

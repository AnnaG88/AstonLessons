package org.example.Les8Exception;

public class TryCatchThrow {
    public static void main(String[] args) {
        // если нужно специально вызвать ошибку
        try {
            throw new NullPointerException("NPE test");
        }
        catch (NullPointerException e) {
            System.out.println("catch block");
        }
    }
}

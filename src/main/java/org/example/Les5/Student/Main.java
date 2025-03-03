package org.example.Les5.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.address.city = "Москва";
        Student.Address address = new Student().new Address();//создали объект на основе адреса, но других параметров у него не будет
    }
}

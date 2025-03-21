package org.example.Les5_Paradigm.Student;

public class Student {
    int studentId;
    String name;
    String group;
    String faculty;
    String email;
    String skype;
    Address address;
    Long phoneHumber;

    public class Address { // внутренний класс
        String city;
        String street;
        String house;
    }

}

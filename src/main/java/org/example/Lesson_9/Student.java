package org.example.Lesson_9;

/*
Задание 1
Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создайте коллекцию, содержащую объекты класса Student. Следует написать метод, который удаляет
студентов со средним баллом < 3, а также отдельный метод, который переводит студента на следующий курс,
если средний балл >= 3. Напишите метод printStudents(Set<Student> students, int course),
который получает список студентов и номер курса. Метод печатает на консоль имена тех студентов,
которые обучаются на данном курсе.
*/
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Student {

    // параметры объектов класса: имя, группа, курс, оценки по предметам
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> subjectGrades;

    // конструктор
    public Student(String name, String group, int course, ArrayList<Integer> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }


}

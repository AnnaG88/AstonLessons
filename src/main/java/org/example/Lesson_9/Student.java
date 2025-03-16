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

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> subjectGrades;


}

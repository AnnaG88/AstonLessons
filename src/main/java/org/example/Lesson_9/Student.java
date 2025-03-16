package org.example.Lesson_9;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Student {

    // параметры объектов класса: имя, группа, курс, оценки по предметам
    private String name;
    private String group;
    private int course;
    private List<Integer> subjectGrades;

    // конструктор
    public Student(String name, String group, int course, List<Integer> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = new ArrayList<>(subjectGrades);
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

    // метод выводит строку с инфо о студенте
    public String toString() {
        return "студент " + name +
                ", группа " + group +
                ", курс " + course +
                ", оценки: " + subjectGrades +
                ", средняя оценка=" + getAverageGrade();
    }

    // метод рассчитывает среднюю оценку
    public double getAverageGrade() {
        if (subjectGrades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : subjectGrades) {
            sum += grade;
        }
        return (double) sum / subjectGrades.size();
    }

    // метод переводит на следующий курс
    public void transferCourse() {
        if (getAverageGrade() >= 3.0) {
            course++;
        }
    }

    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void transferStudents(Set<Student> students) {
        for (Student student : students) {
            student.transferCourse();
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println();
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " курс = " + student.getCourse());
            }
        }

    }
}

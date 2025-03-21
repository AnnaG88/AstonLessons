package org.example.Lesson_9;

import java.util.Set;

public class ListMethods {

    public static void removeUnderperformingStudents(Set<Student> students) { // отчисляем из списка двоечников
        students.removeIf(student -> student.getAverageGrade() < 3.0);
    }

    public static void transferStudents(Set<Student> students) { // переводим на следующий курс
        for (Student student : students) {
            student.transferCourse();
        }
    }

    public static void printStudents(Set<Student> students, int course) { // список по ключу-курсу
        System.out.println();
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " курс = " + student.getCourse());
            }
        }
    }

}

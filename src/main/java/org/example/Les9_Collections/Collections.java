package org.example.Les9_Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // аррэй лист
        ArrayList<Integer> testtt1 = new ArrayList<>();
        testtt1.add(1); // задать элемент листа
        testtt1.add(2);
        testtt1.add(3);
        System.out.println(testtt1);
        testtt1.remove(2); // удалить элемент листа с индексом 2
        System.out.println(testtt1);
        System.out.println(testtt1.get(0)); // вернуть элемент с индексом 0
        testtt1.add(4);
        testtt1.add(5);
        // преобразовать лист в массив
        Integer[] arrrray = new Integer[testtt1.size()];
        testtt1.toArray(arrrray);
        System.out.println(Arrays.toString(arrrray));

        // линкед лист - удобнее если много добавлять удалять элементы
        LinkedList<Integer> testtt3 = new LinkedList<>();
        testtt3.add(7); // задать элемент листа
        testtt3.add(8);
        testtt3.add(9);
        System.out.println(testtt3);

        // Set<Integer> testtt4 = new LinkedHashSet<>(); // сохранит в порядке добавления элементов
        Set<Integer> testtt4 = new HashSet<>(); // не факт в каком порядке
        // Set<Integer> testtt4 = new TreeSet<>(); // в порядке возрастания или по алфавиту
        testtt4.add(10);
        testtt4.add(11);
        testtt4.add(12);
        testtt4.add(11);
        testtt4.add(12);
        System.out.println(testtt4);

        HashMap<String, Integer> testtt5 = new HashMap<>();
        testtt5.put("Анна", 53);
        testtt5.put("Анна", 35);
        testtt5.put("Алия", 33);
        System.out.println(testtt5);
        System.out.println(testtt5.get("Анна")); // вернуть значение по ключу
        System.out.println(testtt5.containsKey("Анна")); // проверить есть ли такой ключ
    }
}

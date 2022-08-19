package com.example.app;

import com.example.group.Student;

import java.util.*;

public class JavaApplication {

    public static void main(String[] args) {
        TreeMap<Student, Integer> map = new TreeMap<>();
        map.put(new Student ("Иванов", "ИВТ-182", 68), 0);
        map.put(new Student ("Петров", "ИВТ-183", 65), 1);
        map.put(new Student ("Сидоров", "ИВТ-182", 81), 2);
        map.put(new Student ("Шведов", "ИВТ-181", 76), 3);
        map.put(new Student ("Аксёнов", "ИВТ-181", 51), 4);
        map.put(new Student ("Баранов", "ИВТ-183", 72), 5);

        Set set = map.entrySet();

        Iterator i = set.iterator();

        // Отображение отсортированных элементов
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        List<String>  orderDataList = mew A
    }
}

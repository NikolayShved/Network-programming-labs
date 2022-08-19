package com.example.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaApplication {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int counter1 = 0, counter2 = 0;

        ArrayList<String> experimental_1 = new ArrayList<>(); //подопытный №1
        experimental_1.stream().sorted(experimental_1.)
        LinkedList<String> experimental_2 = new LinkedList<>(); //подопытный №2

        // добавление элемента в конец списка (1000000 операций)
        while (counter1 <= 1000000) {
            experimental_1.add("str");
            //experimental_2.add("str");
            counter1++;
        }

        // удаление элемента с начала списка (1000 операций)
        while (counter2 <= 1000) {
            experimental_1.remove(counter2);
            //experimental_2.remove(counter2);
            counter2++;
        }

        long finishTime = System.currentTimeMillis() - startTime;
        System.out.println("Программа выполнялась " + finishTime + " миллисекунд");

        experimental_1.stream().filter(e -> e.)
    }


}

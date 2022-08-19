package com.example.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

public class JavaApplication {

    public static double[] task(double[] a) {

        for (int i = 0; i < 10_000_000; i++) {
            a[i] = (double) Math.round((Math.random() * 30) - 15);
        }
        Set set = new LinkedHashSet();
        for (int i = 0; i < a.length; i++) {
            try{
                if (a[i] < 0.0d)
                    throw new IllegalArgumentException("Элемент" + a[i] + "не должен быть меньше нуля");
                else
                    set.add(a[i]);
            }
            catch (IllegalArgumentException  e){
                System.out.println(e);
            }
        }
        set.forEach(System.out::println);
        return set.stream().mapToDouble(num -> Double.parseDouble(String.valueOf(num))).toArray();
    }


    public static void main(String[] args) throws IOException {

        double[] a = new double[10_000];
        task(a);
//        // заполнение списка
//        System.out.println("Введите 10 фамилий:");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i+1 + ") ");
//            String s = reader.readLine();
//            surnamesList.add(s);
//        }
//
//        // проверка на количество повторений каждой фамилии и удаление повторяющихся значений в списке
//        for(int i = 0; i < surnamesList.size() - 1; i++) {
//            int counter = 1;
//            for(int j = i + 1; j < surnamesList.size(); j++) {
//                if ((surnamesList.get(i).equals(surnamesList.get(j))) && (i != j)){
//                    counter++;
//                    surnamesList.remove(j);
//                }
//            }
//            System.out.println("Символ "+ surnamesList.get(i) + " встречается " + counter +" раз");
//        }
//
//        // сортировка списка
//        Collections.sort(surnamesList);
//
//        // вывод на экран нового списка
//        System.out.println("Вывод изменённого списка фамилий:");
//        for(String surnamesListNew : surnamesList)
//        {
//            System.out.println(surnamesListNew);
//        }
    }
}

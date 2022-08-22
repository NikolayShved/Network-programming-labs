package com.company.app;

import com.company.annotations.returnArea;
import com.company.group.Thing;
import com.company.group.descendants.Apartment;
import com.company.group.descendants.Board;
import com.company.group.descendants.Circle;
import com.company.group.descendants.Rectangle;


import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import com.company.annotations.haveArea;

public class Main {

    public static void main(String[] args) {
        ArrayList<Thing> list = new ArrayList<>();
        Main main = new Main();

        list.add(new Circle());
        list.add(new Rectangle());
        list.add(new Board());
        list.add(new Apartment());

        int randomIndex = ThreadLocalRandom.current().nextInt(list.size());
        main.print(list.get(randomIndex));
    }

    /**
     * Метод, выводящий площадь и имя неизвестного объекта метод выводящий площадь и имя неизвестного объекта
     * @param o - объект неизвестного типа
     */
    void print(Object o) {

        //Вызов названия объекта
        Class c = o.getClass(); //class;
        Annotation[] annotations = c.getAnnotations();
        for (Annotation annotation : annotations) {
            if(annotation instanceof haveArea) {
                haveArea mAnnotation = (haveArea) annotation;
                System.out.println("name: " + mAnnotation.name());
            }
        }

        //Вызов метода getArea
        try {
            Method methods = c.getDeclaredMethod("getArea");
            Annotation[] annotations2 = methods.getDeclaredAnnotations();
            for (Annotation a : annotations2) {
                if (a.annotationType().equals(returnArea.class)) {
                    methods.invoke(o);
                }
            }
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

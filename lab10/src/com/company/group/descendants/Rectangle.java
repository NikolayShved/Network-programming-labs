package com.company.group.descendants;

import com.company.annotations.haveArea;
import com.company.annotations.returnArea;
import com.company.group.Thing;

import java.util.Scanner;

@haveArea(name = "Прямоугольник")
public class Rectangle extends Thing {

    @returnArea
    public void getArea() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        double length = num.nextDouble();
        System.out.println("Введите ширину прямоугольника:");
        double width = num.nextDouble();
        System.out.println("Площадь прямоугольника: " + (width * length));
    }
}

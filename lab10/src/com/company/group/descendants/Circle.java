package com.company.group.descendants;

import com.company.annotations.haveArea;
import com.company.annotations.returnArea;
import com.company.group.Thing;

import java.util.Scanner;

@haveArea(name = "Круг")
public class Circle extends Thing {

    @returnArea
    public void getArea() {
        System.out.println("Введите радиус круга:");
        Scanner num = new Scanner(System.in);
        double radius = num.nextDouble();
        System.out.println("Площадь круга: " + Math.PI * Math.pow(radius, 2));
    }
}

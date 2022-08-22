package com.company.group.descendants;

import com.company.annotations.haveArea;
import com.company.annotations.returnArea;
import com.company.group.Thing;

import java.util.Scanner;

@haveArea(name = "Стол")
public class Board extends Thing {

    @returnArea
    public void getArea() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину стола:");
        double length = num.nextDouble();
        System.out.println("Введите ширину стола:");
        double width = num.nextDouble();
        System.out.println("Площадь стола: " + (Math.PI * width * length));
    }
}

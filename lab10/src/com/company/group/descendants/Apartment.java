package com.company.group.descendants;

import com.company.annotations.haveArea;
import com.company.annotations.returnArea;
import com.company.group.Thing;

@haveArea(name = "Квартира")
public class Apartment extends Thing {


    private String nameObject;

    @returnArea
    public void getArea() {
        System.out.println("Вы запустили расчёт площади квартиры.");
        System.out.println("Программа сработала верно.");
    }
}

package com.example.app;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

public class CalcClient {

    public static void main(String args[ ]) throws Exception {
        URL url = new URL("http://localhost:8081/calc");

        QName qname = new QName("http://app.example.com/", "CalcServerImplService");

        Service service = Service.create(url, qname);

        CalcServer eif = service.getPort(CalcServer.class);

        System.out.println("Введите первое число:");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        System.out.println("Введите второе число:");
        Scanner num2 = new Scanner(System.in);
        int y = num2.nextInt();

        System.out.println("Выберите необходимое Вам действие :");
        System.out.println("1 - Сложить");
        System.out.println("2 - Вычесть");
        System.out.println("3 - Умножить");
        System.out.println("4 - Разделить");
        Scanner num3 = new Scanner(System.in);
        byte choice = num3.nextByte();
        switch(choice)
        {
            case 1:
            {
                String operation = "ADD";    // ADD, SUB, MULT, DIV
                System.out.println("Результат: " + eif.calculate(x,y,operation));
                break;
            }
            case 2:
            {
                String operation = "SUB";    // ADD, SUB, MULT, DIV
                System.out.println("Результат: " + eif.calculate(x,y,operation));
                break;
            }
            case 3:
            {
                String operation = "MULT";    // ADD, SUB, MULT, DIV
                System.out.println("Результат: " + eif.calculate(x,y,operation));
                break;
            }
            case 4:
            {
                String operation = "DIV";    // ADD, SUB, MULT, DIV
                System.out.println("Результат: " + eif.calculate(x,y,operation));
                break;
            }
            default:
            {
                System.out.println("Error! Нужно ввести 1, 2 или 3!");
                System.out.println("Попробуйте ещё раз!!!");
            }
        }

    }
}

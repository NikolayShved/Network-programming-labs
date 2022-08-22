package com.example.app;

import com.example.group.Department;
import com.example.group.Student;
import com.example.xml.XMLFileJAXBAssistant;

import java.util.ArrayList;

public class JavaApplication {

    public static void main(String[]args) {

        ArrayList<Student> students = new ArrayList<>();
        XMLFileJAXBAssistant file = new XMLFileJAXBAssistant();
        String fileName = "D:\\students.xml";

        // заполнение ArrayList
        students.add(new Student(1, "Иванов", 68, 20));
        students.add(new Student(2,"Петров", 65, 21));
        students.add(new Student(3,"Сидоров", 81, 19));
        students.add(new Student(4,"Шведов", 76, 20));
        students.add(new Student(5,"Иксёнов", 51, 20));
        students.add(new Student(6,"Баранов", 72, 19));
        students.add(new Student(7,"Сидорова", 81, 20));
        students.add(new Student(8,"Бугагаков", 51, 20));

        Department department = new Department();
        for (Student student : students) {
            department.getStudents().add(student);
        }

        // сохраняем объект в XML файл
        file.writeXmlFile(department, fileName);

        // восстанавливаем объект из XML файла
        Department dep = file.readXmlFile(fileName);

        // Переносим значение объекта в новый ArrayList и выводим их
        ArrayList<Student> studentsNew = dep.getStudents();
        for (Student s : studentsNew) {
            System.out.println(s.toString());
        }
    }
}
package com.example.app;

import com.example.group.Student;

import java.util.HashSet;

public class JavaApplication {

    public static void main(String[]args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student ("Иванов", 68,20));
        students.add(new Student ("Петров", 65,21));
        students.add(new Student ("Сидоров",  81,19));
        students.add(new Student ("Шведов",  76,20));
        students.add(new Student ("Иксёнов",  51,20));
        students.add(new Student ("Баранов",  72,19));
        students.add(new Student ("Сидорова",  81,20));
        students.add(new Student ("Бугагаков",  51,20));

        for(Student  s : students)
        {
            System.out.println("Фамилия: " + s.getSurname() + ", средний балл: " + s.getAverageMark() + ", возраст: " + s.getAge());
        }
    }
}

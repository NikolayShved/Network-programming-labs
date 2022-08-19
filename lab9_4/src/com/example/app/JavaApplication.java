package com.example.app;

import com.example.group.Student;

import com.example.group.comparator.StudentAgeComparator;
import com.example.group.comparator.StudentAverageMarkComparator;
import com.example.group.comparator.StudentSurnameComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class JavaApplication {

    public static void main(String[] args) {

        Comparator<Student> comparatorStudent = new StudentSurnameComparator().thenComparing(new StudentAverageMarkComparator().thenComparing(new StudentAgeComparator()));
        TreeSet<Student> people = new TreeSet(comparatorStudent);
        people.add(new Student ("Иванов", 68,20));
        people.add(new Student ("Петров", 65,21));
        people.add(new Student ("Сидоров",  81,19));
        people.add(new Student ("Шведов",  76,20));
        people.add(new Student ("Иксёнов",  51,20));
        people.add(new Student ("Баранов",  72,19));

        for(Student  student : people)
        {
            people.stream().max(people -> );
            System.out.println("Фамилия: " + student.getSurname() + ", средний балл: " + student.getAverageMark() + ", возраст: " + student.getAge());
        }
    }
}

package com.example.group.comparator;

import com.example.group.Student;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}

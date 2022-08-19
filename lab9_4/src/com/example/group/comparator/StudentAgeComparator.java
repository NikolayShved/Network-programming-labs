package com.example.group.comparator;

import com.example.group.Student;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        {
            if(a.getAge() > b.getAge())
            {
                return 1;
            }
            else if(a.getAge() < b.getAge())
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }
}

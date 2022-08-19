package com.example.group.comparator;

import com.example.group.Student;

import java.util.Comparator;

public class StudentAverageMarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b)
    {
        if(a.getAverageMark() > b.getAverageMark())
        {
            return 1;
        }
        else if(a.getAverageMark() < b.getAverageMark())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

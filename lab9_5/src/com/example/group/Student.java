package com.example.group;

import java.util.Objects;

public class Student {

    private String surname;
    private int averageMark;
    private int age;

    public Student (String surname, int averageMark, int age) {
        this.surname = surname;
        this.averageMark = averageMark;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String _surname) {
        surname = _surname;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int _averageMark) {
        averageMark = _averageMark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _age) {
        age = _age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return averageMark == student.averageMark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageMark);
    }
}

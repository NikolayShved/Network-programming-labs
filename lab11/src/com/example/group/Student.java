package com.example.group;

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
}
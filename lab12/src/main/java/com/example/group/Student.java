package com.example.group;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlAttribute(name = "id",required = true)
    private int id;

    @XmlElement(required = true)
    private String surname;

    @XmlElement(required = true)
    private int averageMark;

    @XmlElement(required = true)
    private int age;

    public Student() {
    }

    public Student (int id, String surname, int averageMark, int age) {
        this.id = id;
        this.surname = surname;
        this.averageMark = averageMark;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", surname = '" + surname + '\'' +
                ", averageMark = " + averageMark +
                ", age = " + age +
                '}';
    }
}

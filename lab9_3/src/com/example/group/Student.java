package com.example.group;

public class Student implements Comparable<Student> {

    private String surname;
    private String group;
    private int averageMark;

    public Student (String surname, String group, int averageMark) {
        this.surname = surname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String _surname) {
        surname = _surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String _group) {
        group = _group;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int _averageMark) {
        averageMark = _averageMark;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("surname = ").append(surname).append('\'');
        sb.append(", group = ").append(group).append('\'');
        sb.append(", averageMark = '").append(averageMark);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student student) {
        return this.averageMark - student.getAverageMark();
    }
}

package com.example.group;

import javax.xml.bind.annotation.*;

import java.util.ArrayList;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Department {

    @XmlElement(name = "student")
    private ArrayList<Student> students = new ArrayList<>();

    public Department() {
    }

    public Department(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setEmployees(ArrayList<Student> students) {
        this.students = students;
    }
}

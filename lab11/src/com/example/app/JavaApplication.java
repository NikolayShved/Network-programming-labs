package com.example.app;

import com.example.group.Student;
import com.example.xml.XMLFileAssistant;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;
import java.util.ArrayList;

public class JavaApplication {

    public static void main(String[]args) throws IOException, SAXException, ParserConfigurationException {

        ArrayList<Student> students = new ArrayList<>();
        XMLFileAssistant file = new XMLFileAssistant();

        // заполнение ArrayList
        students.add(new Student("Иванов", 68, 20));
        students.add(new Student("Петров", 65, 21));
        students.add(new Student("Сидоров", 81, 19));
        students.add(new Student("Шведов", 76, 20));
        students.add(new Student("Иксёнов", 51, 20));
        students.add(new Student("Баранов", 72, 19));
        students.add(new Student("Сидорова", 81, 20));
        students.add(new Student("Бугагаков", 51, 20));

        //функция для передачи значений ArrayList в XML файл (DOM Parser)
        file.writeXmlFile(students);

        //функция для считывания значений из XML файла и их записи в ArrayList (SAX Parser)
        file.readXmlFile();
    }
}

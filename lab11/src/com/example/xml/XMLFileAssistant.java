package com.example.xml;

import com.example.group.Student;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class XMLFileAssistant {

    /**
     * Функция для создания XML файла
     * @param doc
     */
    public void createXmlFile(Document doc) throws TransformerConfigurationException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        try {
            FileWriter fos = new FileWriter("D:\\students.xml");
            StreamResult result = new StreamResult(fos);
            transformer.transform(source, result);
        } catch (IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

    /**
     * Функция для записи данных в XML файл
     * @param list
     */
    public void writeXmlFile(ArrayList<Student> list) {
        try {

            DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder build = dFact.newDocumentBuilder();
            Document doc = build.newDocument();

            Element root = doc.createElement("Users");
            for (Student student : list) {
                Element user = doc.createElement("user");
                user.setAttribute ("Surname", student.getSurname());
                user.setAttribute ("AverageMark", String.valueOf(student.getAverageMark()));
                user.setAttribute("Age", String.valueOf(student.getAge()));
                root.appendChild(user);
            }
            doc.appendChild(root);
            createXmlFile(doc);
        } catch (ParserConfigurationException | TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Функция для чтения данных из XML файла
     */
    public void readXmlFile() throws ParserConfigurationException, SAXException, IOException {
        ArrayList<Student> students = new ArrayList<>();
        DefaultHandler handler = new DefaultHandler()
        {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                if (qName.equals("user")) {
                    String surname = attributes.getValue("Surname");
                    int averageMark = Integer.parseInt(attributes.getValue("AverageMark"));
                    int age = Integer.parseInt(attributes.getValue("Age"));
                    students.add(new Student(surname, averageMark, age));
                }
            }
        };
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("D:\\students.xml"), handler);
        for(Student  s : students)
        {
            System.out.println("Фамилия: " + s.getSurname() + ", средний балл: " + s.getAverageMark() + ", возраст: " + s.getAge());
        }
    }
}

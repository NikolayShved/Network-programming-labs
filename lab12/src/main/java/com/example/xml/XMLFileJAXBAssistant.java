package com.example.xml;

import com.example.group.Department;

import javax.xml.bind.*;

import java.io.File;

/**
 * Класс для работы с XML файлом с помощью фреймворка JAXB
 */
public class XMLFileJAXBAssistant {

    /**
     * Функция для записи данных в XML файл
     * @param department - Корневой объект, содержащий множество объектов Student
     * @param fileName - Полный путь к XML файлу
     */
    public void writeXmlFile(Department department, String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext context = JAXBContext.newInstance(Department.class);
            Marshaller write = context.createMarshaller();

            // Флаг для читабельного вывода XML в JAXB
            write.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Перенос данных в XML файл
            write.marshal(department, file);

        } catch (PropertyException ex) {
            ex.printStackTrace();
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Функция для чтения данных из XML файла
     * @param fileName - Полный путь к XML файлу
     * @return объект Department, который содержит ArrayList объектов Student
     */
    public Department readXmlFile(String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(Department.class);
            Unmarshaller read = jaxbContext.createUnmarshaller();
            return (Department) read.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}

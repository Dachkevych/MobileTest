package com.epam.lab.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class UserReader {

    public static User read(File xml) {
        User dataObject = new User();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            dataObject = (User) unmarshaller.unmarshal(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataObject;
    }
}
